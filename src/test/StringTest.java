package test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	
	private String str;
	
	public static void main(String[] args) {
		StringTest test = new StringTest();
		//test.test1();
		//test.strChecked();
		String str="101056你";
		test.strChecked(str);
		
	}
	
	public boolean strChecked(String str) {
	    String regEx = "^(\\d{8})$"; //8位数字
	    Pattern pattern = Pattern.compile(regEx);
	    Matcher matcher = pattern.matcher(str);
	    boolean rs = matcher.matches();
	    System.out.println(rs);
	    return rs;
	}
	
	public void strChecked() {
		String str="10105678321";
	    String regEx = "^(\\d{8}|\\d{11})$"; //8位或11位数字
	    String regEx2 = "^[0-9_]+$";//纯数字
	    Pattern pattern = Pattern.compile(regEx);
	    Matcher matcher = pattern.matcher(str);
	    boolean rs = matcher.matches();
	    System.out.println(rs);
	}
	
	
	public void test1() {
		str = "joanthan";
	}
	
	public void name() {
		/*List list = new ArrayList<>();
		System.out.println(list);*/
		System.out.println(str);
	}

}
