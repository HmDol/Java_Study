package day01;

import java.util.Scanner;


public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요 : ");
		System.out.println("종료는 q를 입력하세요.");
		
		Person p1 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		
		}while(! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
