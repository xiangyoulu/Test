package test;


/**
 * 判断平年闰年
 * 
 * 公元年数可被4整除为闰年,但是整百（个位和十位均为0）的年数必须是可以被400整除的才是闰年（比如1900年不是闰年），
 * 其他都是平年。
 * 例如：1997年是平年，2002年是平年；1996年是闰年，2000年是闰年。
 * 平年二月有28天，而闰年二月有29天。
 * @author Administrator
 *
 */
public class DateTest {
	
	public static void main(String[] args) {
		pingOrRun(5);
		
		//System.out.println(5/2);
		
	}
	
	public static void pingOrRun(int year) {
		if(year%4 == 0){
			if(year%100 == 0 && year%400 == 0){
				System.out.println("闰年");
			}else{
				System.out.println("平年");
			}
		}else{
			System.out.println("平年");
		}
	}

}
