package day0803;

class Test{
	String str;
	int num;
	
	Test(){
		str = "기본값";
		num = 10;
	}
	
	Test(String str, int num){
		this.str = str;
		this.num = num;
	}
	
	void testPrint() {
		System.out.println(str);
		System.out.println(num);
	}
}

public class 생성자 {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test("변환값", 20);
		
		test1.testPrint();
		test2.testPrint();
		
	}
}
