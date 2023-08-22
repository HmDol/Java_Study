package day0803;

class Test2{
	int a; // 일반 맴버변수
	static int b; //static 맴버 변수, 객체 소속이 아니라 클래스 소속이다.
	
	static{// static 초기화 블럭
		b=30;
	}
	
	
	void print() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	
}

public class static맴버변수 {
	public static void main(String[] args) {
		
		System.out.println(Test2.b + 3123);
		
		Test2 t1 = new Test2();
		t1.a++;
		Test2.b++;
		t1.print();
		
		Test2 t2 = new Test2();
		t2.a++;
		Test2.b++;
		t2.print();
		
		Test2 t3 = new Test2();
		t3.a++;
		Test2.b++;
		t3.print();

	}

}
