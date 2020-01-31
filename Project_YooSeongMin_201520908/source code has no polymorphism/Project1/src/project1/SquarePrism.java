package project1;

import java.util.Scanner;

public class SquarePrism extends Square implements Prism3D{
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
	public double getArea() {
		double result = 2 * super.getArea() + super.getDistance() * nh;
		return result;
	}
	
	@Override
	public double getVolume() {
		return super.getArea()*nh;
	}
	
	@Override
	public String toString() {
		return String.format("Type of shape: Square Prism\n"+
	 			 			 "Coordinates of Upper Left vertex : %.1f, %.1f\n"+
	 			 			 "Coordinates of Lower Right vertex : %.1f, %.1f\n"+
	 			 			 "Side of a Square : %.2f\n"+
							 "Normal Height : %.1f\n"+
							 "Larteral Surface Area : %.2f\n"+
							 "Surface Area : %.2f\n"+
							 "Volume : %.2f\n"
							 ,UL.getX(),UL.getY()
				 			 ,LR.getX(),LR.getY()
				 			 ,this.getDistance() / 4.0
				 			 ,this.getNormalHeight()
				 			 ,this.getDistance() * this.getNormalHeight()
				 			 ,this.getArea()
				 			 ,this.getVolume()
							 );
	}
}
