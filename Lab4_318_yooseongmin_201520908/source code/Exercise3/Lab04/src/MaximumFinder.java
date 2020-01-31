import java.util.*;
import java.lang.*;

public class MaximumFinder {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double result = maximum(number1,number2,number3);
		double avgresult = avg(number1,number2,number3);
		
		System.out.println("Maximum is: "+result);
		System.out.println("Average is: "+avgresult);
	}
	
	public static double maximum(double x,double y, double z) {
		double MaximumValue = x;
		if(MaximumValue < y) {
			MaximumValue = y;
		}
		if(MaximumValue < z) {
			MaximumValue = z;
		}
		
		return MaximumValue;
	}
	
	public static double avg(double x, double y, double z) {
		double avg = (x+y+z) / 3.0;
		return avg;
	}
}
