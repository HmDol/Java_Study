package day0810;

import java.util.HashMap;

public class Map2 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("name", "aaaa");
		map.put("tel", "111");
		map.put("addr,","대한민국");
		map.put("name", "bbbb"); // 키 중복시 수정이 됨
		
		System.out.println(map);
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		for(String val : map.values()) {
			System.out.println(val);
		}
		
	}
}
