package day0803;
// 객체가 생성도리따 마다 몇번째 객체인지 출력. 클래스 내부에서 출력
class Test3{
	static int cnt;
	
	Test3(){
		
		System.out.println(++cnt + "번째 생성자");
	}
}

public class static맴버변수2 {
	public static void main(String[] args) {
		Test3 t_1 = new Test3();
		Test3 t_2 = new Test3();
		Test3 t_3 = new Test3();
		Test3 t_4 = new Test3();
		Test3 t_5 = new Test3();
		
		
	}
}
