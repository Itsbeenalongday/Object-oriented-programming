package Q10;

public class Outer {
	static class StaticInner{
		public void M1() {
			System.out.println("Running a method of Static Inner class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInner si = new StaticInner();
		si.M1();
	}

}
