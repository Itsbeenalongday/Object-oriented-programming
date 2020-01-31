package Q4;

class Outer {
	class Inner{
		public void M1() {
			System.out.println("inner class method is running");
		}
	}
	
	public void M2() {
		Inner i =  new Inner();
		i.M1();
	}
	
	public static void main(String args[]) {
		Outer o = new Outer();
		o.M2();
	}
}
