package day0810;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String만 저장하는 list 생성
		ArrayList<String> list = new ArrayList<>();
		list.add("aaaa"); // 끝에 추가
		list.add(0, "bbbb"); // 인덱스에 끼우기
		list.set(1, "abcd"); // 인덱스 값 수정
		System.out.println(list);
	}

}
