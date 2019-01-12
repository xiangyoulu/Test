package test;

import java.util.ArrayList;
import java.util.List;

public class NullTest {
	
	public static void main(String[] args) {
		//listTest();
		String a = null;
        String b = "";
        String c = new String();
		test1(c);
	}
	
	/**
	 * StringUtils.isE
	 */
	public static void test1(String string){
        if(string==null){
            System.out.println("string == null");
        }
        if("".equals(string)){
            System.out.println("string 为 '' ");
        }
        if(string.isEmpty()){
            System.out.println("string 为 empty");
        }
    }
	
	/**
	 * 集合为空 or 为null的区别
	 * list.isEmpty()和list.size()==0 没有区别
	 */
	public static void listTest() {
		List list = null;
		System.out.println(list==null);
		//System.out.println(list.isEmpty());//java.lang.NullPointerException
		list = new ArrayList<>();
		System.out.println(list==null);//false
		System.out.println(list.isEmpty());//true
		list.add(1);
		System.out.println(list==null);//false
		System.out.println(list.isEmpty());//false
	}

}
