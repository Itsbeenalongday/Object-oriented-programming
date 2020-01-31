import java.util.Scanner;
import java.lang.Math;
public class MaximumFinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter three floating -point values separated by spaces: ");
		 double number1 = input.nextDouble();
		 double number2 = input.nextDouble();
		 double number3 = input.nextDouble();
		 
		 double result = maximum(number1, number2, number3);
		 System.out.println("Maximum is : "+result);
		 
		 double average = average(number1, number2, number3);
		 System.out.println("Average is : "+average);
	}
	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		if(y>maximumValue) {
			maximumValue = y;
		}
		if(z>maximumValue) {
			maximumValue = z;
		}
		return maximumValue;
	}
	public static double average(double x, double y, double z) {	
		double sum = (x+y+z);
		return sum/3.0;
	}
}