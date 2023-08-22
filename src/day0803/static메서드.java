package day0803;

class Test4{
	int a;
	static int b;
	
	//일반 메서드 : static 맴버변수와 일반 맴버변수를 모두 받ㅇ르 수 있음
	void method1()	{
		a = 1;
		b = 1;
	}
	
	//static 메서드 : 객체 생성전에 호출 -> 객체 생성전에는 일반 맴버변수와 메서드 존재안함
	static void method2() {
	//	a = 1; 일반 맴버변수 사용 불가
		b = 1;
	}
	
	//일반 메서드 : static 맴버변수와 일반 맴버변수를 모두 받ㅇ르 수 있음
	void method3() {
		method1();
		method2();
	}
	
	//static 메서드 : 객체 생성전에 호출 -> 객체 생성전에는 일반 맴버변수와 메서드 존재안함
	static void methode4()	{
//		method1(); 일반 매서드 사용 불가
		method2();
	}
}

public class static메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
