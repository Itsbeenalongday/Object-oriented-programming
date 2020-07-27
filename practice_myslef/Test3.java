
public class Test3 {
	public static void main(String args[]) throws Exception {
		try {
			method();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("종료합니다.");
		}
	}
	
	static int method() {
		try {
			System.out.println("method()에 진입했습니다.");
			int a = 4/0;
			return 0;
		}catch(Exception e) {
			System.out.println("예외 발생");
			return 1;
		}finally {
			System.out.println("method()의 finally블럭에 진입했습니다.");
		}
	}
}
