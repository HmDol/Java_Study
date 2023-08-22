package day0810;

import java.util.ArrayList;
import java.util.Iterator;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterator : 반복자 , 리스트에서 요소를 하나씩 꺼내는 것을 반복
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//반복자 생성
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) { // 다음 요소가 있는지 확인
			System.out.println(iter.next()); //next(): 다음요소 꺼내옴
		}
		
		System.out.println("-----------------");
		
		//내부 반복자 사용
		for(String s : list) {
			System.out.println(s);
		}
	}

}
