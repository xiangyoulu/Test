package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	
	public static void main(String[] args) {
		//test1();
		//test2();
		
		List list = new ArrayList();
		for (int i = 0; i < 30; i++) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println("测试git提交");
	}
	
	
	public static void test1() {
		int[] arr = {1,2,3};
		System.out.println(arr);//[I@659e0bfd
		System.out.println(Arrays.toString(arr));//[1, 2, 3]
		
		int arr2[] = new int[5];
		arr2[1] = 1;
		System.out.println(Arrays.toString(arr2));
	}
	
	/**
	 * 二维数组
	 */
	public static void test2() {
		String[][] arr = new String[2][];
		arr[0] = new String[2];
		arr[1] = new String[3];
		arr[0][0] = "hello";
		arr[0][1] = "world";
		arr[1][0] = "this";
		arr[1][1] = "is";
		arr[1][2] = "jonathan";
		System.out.println(Arrays.toString(arr));//[[Ljava.lang.String;@659e0bfd, [Ljava.lang.String;@2a139a55]
		System.out.println(Arrays.toString(arr[0]));//[hello, world]
		
		//遍历数组01 -->for循环
		for (int i = 0; i < arr.length; i++) {
			String[] strings = arr[i];
			System.out.println(Arrays.toString(strings));
		}
		//遍历数组02 -->foreach循环
		for (String[] strings : arr) {
			System.out.println(Arrays.toString(strings));
		}
		
	}

}
