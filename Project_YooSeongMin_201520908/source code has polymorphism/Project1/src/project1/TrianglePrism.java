package project1;

import java.util.Scanner;

public class TrianglePrism extends Triangle implements Prism3D {
	// input enter
	Scanner sc = new Scanner(System.in);

	// member
	private double nh;
	
	// override methods
	
	// set and get shapes

	@Override
	public void setNormalHeight() {
		try {
			
			System.out.print("Please enter normal height : ");
			nh = sc.nextDouble();

			if (nh <= 0) {
				throw new MyException("Error : normal height should be positive\n");
			}
			
		} catch (MyException me) {
			// error message print
			System.out.print(me.getMessage() + "\n");
			// return setShapes
			this.setNormalHeight();
		}
	}
	
	@Override
	public double getNormalHeight() {
		return this.nh;
	}
	
	// area and volume

	@Override
	public double getArea(){
		return 2*super.getArea() + super.getDistance() *nh;
	}
	
	@Override
	public double getVolume() {
		return super.getArea()*nh;
	}
	
	@Override
	public String toString() {
		return String.format("Type of shape: Equilateral Triangle Prism\n"+
				 			 "Coordinates of Vertex One : %.1f, %.1f\n"+
				 			 "Coordinates of Vertex Two : %.1f, %.1f\n"+
				 			 "Coordinates of Vertex One : %.1f, %.1f\n"+
				 			 "Length of side 1 : %.1f\n"+
				 			 "Length of side 2 : %.1f\n"+
				 			 "Length of side 3 : %.1f\n"+
							 "Normal Height : %.1f\n"+
							 "Surface Area : %.1f\n"+
							 "Volume : %.1f\n"
							 ,Vertex1.getX(),Vertex1.getY()
							 ,Vertex2.getX(),Vertex2.getY()
							 ,Vertex3.getX(),Vertex3.getY()
							 ,sideline[0]
							 ,sideline[1]
							 ,sideline[2]
							 ,this.getNormalHeight()
							 ,this.getArea()
							 ,this.getVolume()
							 );
	}
}
