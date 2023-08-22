package day02;
class Test {
	int a = 1;
	int b = 2;
	String name = "ccc";
	

	
	
	Test(){//생성자 : 클래스와 이름이 같고 반환타입이 없음
		System.out.println("생성자");
		a = 11111;
		b = 222222;
		name = "ccccccc";
		System.out.println("생성자후 : " + a + b + name);
	}
	{// 초기화 블록 : 생성자 보다 우선으로 실행됨
		System.out.println("전 : " +  a + b + name);
		a=11;
		b=22;
		name = "ddd";
		System.out.println("후 : " + a + b + name);
	}
	
}
public class 메서드1 {
	public static void main(String[] args) {
		Test test = new Test();
		
		System.out.println("현재 : " + test.a + test.b + test.name);
	}
	
}
