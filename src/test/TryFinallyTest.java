package test;

public class TryFinallyTest {
	
	public static void main(String[] args) {
		System.out.println(test1());
	}
	
	
	@SuppressWarnings("finally")
	public static int test1() {
		try {
			//int i = 1/0;
			System.out.println("try");
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch");
			return 1;
		}finally {
			System.out.println("finally");
			return 2;
		}
	}

}
