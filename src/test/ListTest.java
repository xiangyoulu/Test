package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListTest {
	
	public static void main(String[] args) {
		//test3();
		getMaxMinValue();
	}
	
	
	/**
	 * 取集合最大/最小值
	 */
	public static void getMaxMinValue() {
		List<String> list = new ArrayList<>();
		list.add("8");
		list.add("9");
		list.add("10");
		System.out.println(Collections.max(list));
	}
	
	
	/**
	 * ArrayList和LinkedList的区别
	 */
	public static void test3() {
		List<String> list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);//[a, b, c]
		List<String> list2 = new LinkedList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		System.out.println(list2);//[a, b, c]
		
	}
	
	/**
	 * ArrayList与HashSet,LinkedHashSet的区别
	 */
	public static void test2() {
		List<String> sList = new ArrayList<>();//结果为有序可重复
		sList.add("a");
		sList.add("b");
		sList.add("c");
		sList.add("1");
		sList.add("c");
		System.out.println(sList);//[a, b, c, 1, c]
		
		Set<String> sList2 = new HashSet<String>();//结果为无序不可重复
		sList2.add("a");
		sList2.add("b");
		sList2.add("c");
		sList2.add("1");
		sList2.add("c");
		System.out.println(sList2);//[a, 1, b, c]
		
		Set<String> sList3 = new LinkedHashSet<String>();//结果为有序不可重复
		sList3.add("a");
		sList3.add("b");
		sList3.add("c");
		sList3.add("1");
		sList3.add("c");
		System.out.println(sList3);//[a, b, c, 1]
	}
	
	/**
	 * 笔试题
	 */
	public static void test1() {
		List<String> sList = new ArrayList<>();
		sList.add("a");
		sList.add("b");
		sList.add("c");
		sList.add("d");
		sList.add("e");
		sList.add("f");
		sList.add("g");
		//sList.size() = 7

		List<String> subList = sList.subList(0, 4);
		//subList = [a, b, c, d]

		subList.remove(1);
		subList.remove(2);
		//subList = [a, c]

		subList.add("h");
		subList.add("J");
		System.out.println(sList);//[a, c, h, J, e, f, g]

	}

}
