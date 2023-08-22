package day0809;
import java.util.Scanner;

public class 금지어 {
	
	static String[] words = { "십장생", "시베리안허스키", "바나나", "학교" };
	
	public static String	check(String str) {
		String[] arr = str.split(" ");
		for (String s : arr) {
			for (String w : words) {
				if (s.equals(w)) {
					str = str.replace(s, "삐리리");
				}
			}
		}
		return str;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("내용을 입력하고 엔터를 치시오");
		System.out.println("루프를 멈추려면 stop입력");
		while (true) {
			String str = sc.nextLine();
			if (str.startsWith("stop")) {
				break;
			}
			str = check(str);
			sb.append(str + "\n");// append("문자열"): StringBuilder에 문자열을 덧붙임
		}
		System.out.println(sb.toString());

	}

}