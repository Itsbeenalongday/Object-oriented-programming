package project1;

import java.util.Scanner;

public class Square implements Shape2D {
	// input enter
	Scanner sc = new Scanner(System.in);

	// has a relation
	Point2D UL = new Point2D();
	Point2D UR = new Point2D();
	Point2D LL = new Point2D();
	Point2D LR = new Point2D();

	// set Three points
	public void setPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		UL.setPoint(x1, y1);

		UR.setPoint(x2, y2);
		
		LL.setPoint(x3, y3);
		
		LR.setPoint(x4, y4);
	}

	@Override
	public void getShapes() {
		double x1;
		double x2;
		double x3;
		double x4;

		double y1;
		double y2;
		double y3;
		double y4;

		// enter points
		try {
			System.out.print("Please input x-coordinate of the Upper Left of the Square : ");
			x1 = sc.nextDouble();
			System.out.print("Please input y-coordinate of the Upper Left of the Square : ");
			y1 = sc.nextDouble();
			System.out.print("Please input x-coordinate of the Lower Right of the Square : ");
			x4 = sc.nextDouble();
			System.out.print("Please input y-coordinate of the Lower Right of the Square : ");
			y4 = sc.nextDouble();

			// set remain points
			x3 = x1;
			y2 = y1;
			x2 = x4;
			y3 = y4;

			// exception handling
			/*
			 * error 1 if the upper left vertex UL(x1,y1) and lower right vertex LR(x4,y4)
			 * are the same, the program should display the error message and request the
			 * user to enter two different vertices.
			 * 
			 * error 2 if x4 is less than x1, the program should display the error message
			 * and request the user to enter correct vertices
			 * 
			 * error 3 if y4 is less than y1, the program should display the error message
			 * and request the user to enter correct vertices
			 */

			if (x1 >= x4) {
				throw new MyException( "\nx-coordinate of upper left vertex should be less than x-coordinate of lower right vertex.\n" + 
					     			   "Please enter valid coordinates.\n");
			}

			if (y4 >= y1) {
				throw new MyException("\ny-coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\n" + 
					     			  "Please enter valid coordinates.\n");
			}

			// set points
			setPoint(x1, y1, x2, y2, x3, y3, x4, y4);

		} catch(MyException me) {
			// error message print
			System.out.print(me.getMessage()+"\n");
			// return getShapes
			this.getShapes();
		}
	}
	
	double[] sideline = new double[2];
	
	@Override
	public double getDistance() {
		sideline[0] = LR.getX() - UL.getX();
		sideline[1] = UL.getY() - LR.getY();
		
		double sum = 0;
		for(double s : sideline) {
			sum += s;
		}
		
		return 2.0*sum;
	}
	
	public double getBaseArea() {
		getDistance();
		double area = sideline[0] * sideline[1];
		return area;
	}
	
	@Override
	public double getArea() {
		getDistance();
		double area = sideline[0] * sideline[1];
		return area;
	}
	
	@Override
	public String toString() {
		double result = getArea();
		return String.format("Type of shape: Square\n"+
				 			 "Coordinates of Upper Left vertex : %.1f, %.1f\n"+
				 			 "Coordinates of Lower Right vertex : %.1f, %.1f\n"+
				 			 "Side of a Square : %.2f\n"+
				 			 "Surface Area : %.2f\n"
				 			 ,UL.getX(),UL.getY()
				 			 ,LR.getX(),LR.getY()
				 			 ,sideline[0]
				 			 ,result
				 			 );
	}
}
