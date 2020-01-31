package project1;

import java.util.Scanner;

public class SquarePyramid extends SquarePrism implements Pyramid3D {
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

			if (sh <= getNormalHeight()) {
				throw new MyException("Error : Slant Height should be larger than normal Height.\n");
			}

		} catch (MyException me) {
			// error message print
			System.out.print("\n"+me.getMessage() + "\n");
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
		return this.getBaseArea() + (1/2.0) * this.getDistance() * this.getSlantHeight();
	}
	
	@Override
	public double getVolume() {
		return (1/3.0) * this.getBaseArea() * this.getNormalHeight(); 
	}
	
	@Override
	public String toString() {
		return String.format("Type of shape: Square Prism\n"+
	 			 			 "Coordinates of Upper Left vertex : %.1f, %.1f\n"+
	 			 			 "Coordinates of Lower Right vertex : %.1f, %.1f\n"+
	 			 			 "Side of a Square : %.2f\n"+
							 "Normal Height : %.1f\n"+
	 			 			 "Slant Height : %.1f\n"+
							 "Surface Area : %.2f\n"+
	 			 			 "Volume : %.2f\n"
	 			 			,UL.getX(),UL.getY()
				 			,LR.getX(),LR.getY()
				 			,this.getDistance() / 4.0
				 			,this.getNormalHeight()
				 			,this.getSlantHeight()
				 			,this.getArea()
				 			,this.getVolume()
				 			);
	}
}
