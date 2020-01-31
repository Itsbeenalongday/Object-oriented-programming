package Q3;

class Outer {
	class Inner{
		public void M1() {
			System.out.println("innner class method is runnig");
		}
	}
	
	public static void main(String args[]) {
		Outer o = new Outer();
		Inner i = o.new Inner();
		i.M1();
	}
}
