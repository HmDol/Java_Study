package day02;

class Test2{
	int a = 1;
	float b = 3.4f;
	String c = "adfd";
	
	//메서드. 반환값 없음
	void hello() {
		System.out.println("hello!!");
		
	}
	
	//반환값없음. String 파라메타 1개 : 호출할때 문자열 하나를 넣어줘야함
	void hello2(String name) {
		System.out.println("hello " + name);
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	int method() {
		return a;
	}
	float method1() {
		return b;
	}
	String method3() {
		return c;
	}
}

public class 맴버변수초기화 {
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.hello();
		test.hello2( "하위" );
		
	}
}
