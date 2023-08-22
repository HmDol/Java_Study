package day0809;

class Test{
	int num;
	String data;
}


public class EqualsTest {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.num = 1;
		t1.data = "aaa";
		
		Test t2 = new Test();
		t2.num = 1;
		t2.data = "aaa";
		
		Test t3 = t1;
		
		System.out.println("t1.equals(t2) = " + t1.equals(t2)); // 참조값 비교
		System.out.println("t1 == t2: " + (t1 == t2)); // 참조값 비교
		
		System.out.println("t1.equals(t3) = " + t1.equals(t3));// 참조값 비교
		System.out.println("t1 == t3: " + (t1 == t3));// 참조값 비교
	
		
	
	}

}
