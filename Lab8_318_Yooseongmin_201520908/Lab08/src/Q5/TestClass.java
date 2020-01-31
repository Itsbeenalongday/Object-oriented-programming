package Q5;

class Outer{
	class Inner{
		public void M1() {
			System.out.println("inner class method is running");
		}
	}
}

public class TestClass{
	public static void main(String args[]) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.M1();
	}
}