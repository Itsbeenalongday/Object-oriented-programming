
public class MethodOverload {
	public static void main(String args[]) {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));
		System.out.printf("Square of string 'hello' is %s%n",square("hello"));
	}
	
	public static int square(int intValue) {
		System.out.printf("%nCalled square with int argument: %d%n",intValue);
		return intValue * intValue;
	}
	
	public static double square(int n) {
		System.out.printf("%nCalled square with double argument: %n%n",n);
		return n * n;
	}
	
	public static String square(String stringValue) {
		System.out.printf("%nCalled square with string argument: %s%n",stringValue);
		return stringValue+stringValue;
	}
}
