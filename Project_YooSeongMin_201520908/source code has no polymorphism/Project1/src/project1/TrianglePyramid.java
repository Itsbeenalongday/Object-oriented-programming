package project1;

import java.util.Scanner;

public class TrianglePyramid extends TrianglePrism implements Pyramid3D {
	// input enter
	Scanner sc = new Scanner(System.in);

	// member
	private double sh;

	// override methods

	// set and get shapes
	
	@Override
	public void setSlantHeight() {
		try {
			System.out.print("Please enter slant height : ");
			sh = sc.nextDouble();

			if (sh <= this.getNormalHeight()) {
				throw new MyException("Error : Slant Height should be larger than normal Height.\n");
			}
		}catch (MyException me) {
			// error message print
			System.out.print(me.getMessage() + "\n");
			// return setShapes
			this.setSlantHeight();
		}
	}

	@Override
	public double getSlantHeight() {
		return this.sh;
	}

	// compute Area and Volume

	@Override
	public double getArea() {
		// caution!! this class extends from Triangle Prism
		return this.getBaseArea() + (1 / 2.0) * this.getDistance() * this.getSlantHeight();
	}

	@Override
	public double getVolume() {
		return (1 / 3.0) * this.getBaseArea() * this.getNormalHeight();
	}

	@Override
	public String toString() {
		return String.format("Type of shape: Equilateral Triangle Pyramid\n" + 
							 "Coordinates of Vertex One : %.1f, %.1f\n" +
							 "Coordinates of Vertex Two : %.1f, %.1f\n" + 
							 "Coordinates of Vertex One : %.1f, %.1f\n" +
							 "Length of side 1 : %.1f\n" + 
							 "Length of side 2 : %.1f\n" + 
							 "Length of side 3 : %.1f\n" +
							 "Normal Height : %.1f\n" + 
							 "Slant Height : %.1f\n" + 
							 "Surface Area : %.1f\n" +
							 "Volume : %.1f\n"
							 ,Vertex1.getX(), Vertex1.getY()
							 ,Vertex2.getX(), Vertex2.getY()
							 ,Vertex3.getX(), Vertex3.getY()
							 ,sideline[0] 
							 ,sideline[1] 
							 ,sideline[2] 
							 ,this.getNormalHeight()
							 ,this.getSlantHeight()
							 ,this.getArea()
							 ,this.getVolume()
							 );
	}

}
