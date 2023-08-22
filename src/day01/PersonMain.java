package day01;


//클래스 정의
//클래스 : 객체 1개 표현!!
class Person{ //맴버 변수 + 메서드(클래스 안에서 정의한 함수)
	String name;
	int age;
}
// 힙은 메모리에 주소로 접근
// 스택은 메모리에 이름이로 접근
 
public class PersonMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		//기본 생성자는 객체는 null, 정수는 0, boolean은 false으로 초기화 시킴
		p1.name = "aaa";
		p1. age = 10;
		

		Person p2 = new Person();
		p2.name = "bbb";
		p2. age = 20;
		
		Person p3 = p1; // 객체는 선언했지만 new로 메모리 할당은 없음. p1의 메모리를 공유! 
		p3.name = "ccc";
		p3.age = 30;
		
		int a =0 ; // 초기화 없으면 쓰레기값 할당
		
		System.out.println(a);
		System.out.println("p1.name = "+ p1.name);
		System.out.println("p1.age = "+ p1.age);
		System.out.println("p2.name = "+ p2.name);
		System.out.println("p2.age = "+ p2.age);
		System.out.println("p3.name = "+ p3.name); // null 출력
		System.out.println("p3.age = "+ p3.age); // 0 출력
		System.out.println("------------------------------");
		System.out.println("p1.name = "+ p1.name); // p1의 값도 변경되엇음
		System.out.println("p1.age = "+ p1.age);
		
	}

}



