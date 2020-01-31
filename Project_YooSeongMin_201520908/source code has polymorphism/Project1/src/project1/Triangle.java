package project1;

import java.util.Scanner;

public class Triangle implements Shape2D{
	// input enter
	Scanner sc = new Scanner(System.in);
	
	// member
	boolean notequal = false;
	
	// has a relation
	Point2D Vertex1 = new Point2D();
	Point2D Vertex2 = new Point2D();
	Point2D Vertex3 = new Point2D();

	// set Three points
	public void setPoint(double x1,double y1, double x2, double y2, double x3, double y3) {
		
		Vertex1.setPoint(x1, y1);
		
		Vertex2.setPoint(x2,y2);
		
		Vertex3.setPoint(x3, y3);
	}	
		@Override
		public void getShapes() {
			double x1;
			double x2;
			double x3;
			double y1;
			double y2;
			double y3;
			
			// enter three point
			try {
			System.out.print("Please input x-coordinate of the Vertex 1 of the triangle : ");
			x1 = sc.nextDouble();
			System.out.print("Please input y-coordinate of the Vertex 1 of the triangle : ");
			y1 = sc.nextDouble();
			System.out.print("Please input x-coordinate of the Vertex 2 of the triangle : ");
			x2 = sc.nextDouble();
			System.out.print("Please input y-coordinate of the Vertex 2 of the triangle : ");
			y2 = sc.nextDouble();
			System.out.print("Please input x-coordinate of the Vertex 3 of the triangle : ");
			x3 = sc.nextDouble();
			System.out.print("Please input y-coordinate of the Vertex 3 of the triangle : ");
			y3 = sc.nextDouble();
			/*
			 * If the tree vertices are collinear (lie on the same line), 
			 * they cannot form a triangle because these points form a straight line. 
			 * Check this by comparing their slopes. 
			 * Hence, the program should display the error message and 
			 * request the user to enter non-collinear vertices 
			 */
			
			/* slope check
			 * if 
			 * Slope of the straight line between point 1 and point 2
			 * =
			 * Slope of the straight line between point 2 and point 3
			 * then,
			 * There are three points on a straight line
			 */
			if((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)) {
				throw new MyException("\nError: the three vertices are collinear. Please enter non-collinear vertices\n");
			}
				
			//set points
			this.setPoint(x1,y1,x2,y2,x3,y3);
			
			// Warning check
			this.getDistance();
			
			if(notequal) {
				System.out.printf("\nWarning: the three sides are not equal, but continue your operation.\n");
			}
			
			}catch(MyException me) {
				// error message print
				System.out.print(me.getMessage()+"\n");
				// return getShapes
				this.getShapes();
			}
		}
		
		// for sideline
		double[] sideline = new double[3];
		
		@Override
		public double getDistance(){
			// vertex1 - vertex2
			sideline[0] = Math.sqrt((Vertex1.getX()-Vertex2.getX())*(Vertex1.getX()-Vertex2.getX())+(Vertex1.getY()-Vertex2.getY())*(Vertex1.getY()-Vertex2.getY()));
			// vertex1 - vertex3
			sideline[1] = Math.sqrt((Vertex1.getX()-Vertex3.getX())*(Vertex1.getX()-Vertex3.getX())+(Vertex1.getY()-Vertex3.getY())*(Vertex1.getY()-Vertex3.getY()));
			// vertex2 - vertex3
			sideline[2] = Math.sqrt((Vertex3.getX()-Vertex2.getX())*(Vertex3.getX()-Vertex2.getX())+(Vertex3.getY()-Vertex2.getY())*(Vertex3.getY()-Vertex2.getY()));
			
			// if Three side is not equal -> warning in getShape
			for(int i = 1; i < sideline.length; i++) {
				if(sideline[i-1] != sideline[i]){
					notequal = true;
				}
			}
			
			double sum = 0;
			for(double s : sideline) {
				sum += s;
			}
			
			return sum;
		}
		
		// for prism and pyramid compute
		public double getBaseArea() {
			double sum = getDistance();
			double p = sum / 2.0;
			double area = Math.sqrt(p*(p-sideline[0])*(p-sideline[1])*(p-sideline[2]));
			return area;
		}
		
		@Override
		public double getArea() {
			double sum = getDistance();
			double p = sum / 2.0;
			double area = Math.sqrt(p*(p-sideline[0])*(p-sideline[1])*(p-sideline[2]));
			return area;
		}
		
		@Override
		public String toString() {
			
			return String.format("Type of shape: Equilateral Triangle\n"+
								 "Coordinates of Vertex One : %.1f, %.1f\n"+
								 "Coordinates of Vertex Two : %.1f, %.1f\n"+
								 "Coordinates of Vertex One : %.1f, %.1f\n"+
								 "Length of side 1 : %.1f\n"+
								 "Length of side 2 : %.1f\n"+
								 "Length of side 3 : %.1f\n"+
								 "Surface Area : %.1f\n"
								 ,Vertex1.getX(),Vertex1.getY()
								 ,Vertex2.getX(),Vertex2.getY()
								 ,Vertex3.getX(),Vertex3.getY()
								 ,sideline[0]
								 ,sideline[1]
								 ,sideline[2]
								 ,this.getArea()
								 );
								 
		}
}
