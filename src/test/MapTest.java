package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	
	public static void main(String[] args) {
		MapTest test = new MapTest();
		//test.test1();
		/*System.out.println(test.hashTest("项友路"));
		System.out.println("项友路".hashCode());*/
		
		int h;
		System.out.println("111".hashCode());
		System.out.println( (h = "111".hashCode()) ^ (h >>> 16));
	}
	
	
	public int hashTest(Object key) {
		int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}
	
	public <K, V> void test1() {
		Map<String, String> map = new HashMap<>();
		//HashMap<K, V> map = new HashMap<>();
		map.put("id", "小明0");
		map.put("id", "小明1");//会覆盖同名的key
		map.put("index", "小明2");
		map.put("ref", "小明3");
		map.put("value", "小明3");
		System.out.println(map);
		selectValue1(map);
	}
	
	//查出指定value对应的所有key值  -->小明3
	public void selectValue1(Map<String, String> map) {
		for(String key: map.keySet()){
			if("id".equals(key))
			System.out.println(map.get(key));
		}
	}
	public void selectValue2(Map<String, String> map) {
		for(Entry<String, String> keyValue: map.entrySet()){
			if("小明3".equals(keyValue.getValue()))
			System.out.println(keyValue.getKey());
		}
	}
	public void selectValue3(Map<String, String> map) {
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Entry<String, String> entrty = iter.next();
			if("小明3".equals(entrty.getValue()))
			System.out.println(entrty.getKey());
		}
	}
	

}
