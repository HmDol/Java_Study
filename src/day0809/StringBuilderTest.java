package day0809;

import java.util.Scanner;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("내용을 입력하고 엔터를 치시오");
		System.out.println("루푸를 멈추려면 stop입력");
		
		while(true) {
			String str = sc.nextLine();
			if(str.startsWith("stop")) {
				break;
			}
			sb.append(str + "\n");
		}
		System.out.println(sb.toString());
		
	}

}
