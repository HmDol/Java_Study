package day0810;

import java.util.ArrayList;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println("전체목록");
		System.out.println(list);
		
		System.out.println("bbb검색");
		if(list.contains("bbb")) {
			int idx = list.indexOf("bbb");
			System.out.println(idx + "번방");
			
		}else {
			System.out.println("존재하지 않음");
		}
		
		list.remove(0);
		System.out.println("0번방 삭제 : " + list);
		
		list.remove("bbb");
		System.out.println("bbb삭제 : "+ list);
		
//		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("리스트 비었음");	
		}else {
			System.out.println("데이터 있음");
		}
		

	}

}
