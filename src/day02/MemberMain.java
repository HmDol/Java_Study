package day02;

import java.util.Scanner;

class Member{
	String id;
	String pwd;
	String name;
	String email;
	
	void printMember(){
		System.out.println("id : "+ id);
		System.out.println("pwd : "+ pwd);
		System.out.println("name : "+ name);
		System.out.println("email : "+ email);
	}
	
	Member(){}
	Member(String id, String pwd, String name, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
}

public class MemberMain {
	public static void main(String[] args) {
		Member mem1 = new Member("mem1_id","mem1_pwd","mem1_name","mem1_email");
		Member mem2 = new Member("mem2_id","mem2_pwd","mem2_name","mem2_email");
		
//		mem1.printMember();
//		mem2.printMember();
		
		
		Member[] m = new Member[5];
//		m[0] = new Member("aaa", "aaaa", "aaaa", "aaaa");
//		m[1] = new Member("b", "bb", "bbb", "bbbb");
//		m[2] = new Member("c", "cc", "ccc", "cccc");
//		m[3] = new Member();
//		m[4] = new Member();
		
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<m.length; i++) {
//			System.out.println(i+"번째 : ");
//			m[i] = new Member(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
//		}
		
//		for(int i = 0; i < m.length; i++) {
//			m[i].printMember();
//			
//		}
		int[] a = {1,2,3,4,5,6,7};
		int[] b;
		int[] c = {11,12,13,14,15,16,17};
		System.arraycopy(a, 1, c, 2, 3); // a의 1번부터의 값을 c의 2번부터 3개 복사해라
		System.out.println(a);
		System.out.println(c);
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();
		
		for(int i = 0; i< c.length; i++) {
			System.out.print(c[i] + "\t");
		}
		
		
	}
	
}
