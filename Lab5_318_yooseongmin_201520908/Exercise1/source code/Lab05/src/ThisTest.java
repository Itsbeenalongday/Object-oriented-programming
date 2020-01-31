
public class ThisTest {
	public static void main(String args[]) {
		SimpleTime time = new SimpleTime(15,30,19);
		System.out.println(time.buildString());
	}
}	

class SimpleTime{
	 int hour;
	 int minute;
	 int second;
	
	 
	public SimpleTime(int h, int m, int s) {
		hour = h;
		minute=m;
		second=s;
	}
	
	
	public String buildString() {
		return String.format("%24s: %s%n%24s: %s",
				"this.toUniversalString()", toUniversalString(),
				"toUniversalString()",toUniversalString());
	}
	
	public String toUniversalString() {
		return String.format("%02d : %02d : %02d", hour,minute,second);
	}
}