import java.util.*;
import java.lang.*;

public class MaximumFinder {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		/* problem 4 - How to remove error -> make instance */
		MaximumFinder m = new MaximumFinder();
		double result = m.maximum(number1,number2,number3);
		double avgresult = avg(number1,number2,number3);
		
		System.out.println("Maximum is: "+result);
		System.out.println("Average is: "+avgresult);
	}
	
	public double maximum(double x,double y, double z) {
		double maximumValue = Math.max(x, y);
		maximumValue = Math.max(maximumValue, z);
		return maximumValue;
	}
	
	public static double avg(double x, double y, double z) {
		double avg = (x+y+z) / 3.0;
		return avg;
	}
}
