package Q8;

class Outer {
	private int x = 10;
	private static int y = 20;
	public void M1() {
		int z= 30;
		class Inner{
			public void M2() {
				System.out.println("sum: "+(x+y+z));
			}
		}
		Inner in = new Inner();
		in.M2();
		in.M2();
		in.M2();
	}
	public static void main(String args[]) {
		Outer out = new Outer();
		out.M1();
	}
}
