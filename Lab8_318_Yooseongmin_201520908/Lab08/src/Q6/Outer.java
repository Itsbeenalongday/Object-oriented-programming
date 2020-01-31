package Q6;

class Outer {
	private int x = 10;
	private int y = 20;
	
	class Inner{
		public void M1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static void main(String args[]) {
		Outer O = new Outer();
		Outer.Inner I = O.new Inner();
		I.M1();
	}
}
