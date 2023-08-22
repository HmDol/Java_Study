package day0807;

class TestParent{
	int num = 10;
	
	public void method() {
		System.out.println("num : " + num);
	}
}

class TestChild extends TestParent{
	String str = "asdf";

	@Override
	public void method() {

		super.method();
		System.out.println("str : " + str);
	}
	

}

public class 오버라이딩 {

	public static void main(String[] args) {
		TestParent p = new TestParent();
		p.method(); // parent의 메서드 호출
		p.num=12;
		
		System.out.println("---------------------------");		
		TestChild c = new TestChild();
		c.method(); // child의 메서드 호출
		c.num = 20;
		c.str ="asdf";
		
		System.out.println("---------------------------");
		//up-casting : 타입을 부모로 올린 것
		TestParent p2 = new TestChild(); 
		p2.num = 20;
		p2.method();
		
		((TestChild)p2).str = "aasdf";// 다운 케스팅
		
		//instanceof:타입비교 연산자
//		A instanceof B : A,B의 타입을 비교해서 같으면 true,다르면 false
		if(p2 instanceof TestChild)System.out.println("타입같노");
	}

}
