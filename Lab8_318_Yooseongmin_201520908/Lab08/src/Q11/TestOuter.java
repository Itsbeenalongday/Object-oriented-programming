package Q11;

class Outer {
	static class StaticInner{
		public void M1() {
			System.out.println("running a method of Static inner class");
		}
	}
}

class TestOuter{
	public static void main(String args[]) {
		Outer.StaticInner si = new Outer.StaticInner();
		si.M1();
	}
}
