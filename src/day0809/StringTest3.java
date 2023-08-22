package day0809;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aaa,bbb,ccc";
		String[] b = a.split(",");//split(구분자): 구분자를 기준으로 문자열 쪼개서 배열에 담아서 반환
		for (String s : b) {
			System.out.println(s);
		}
	}
}


