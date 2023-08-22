package day0803;

class Add{
	int add(int a , int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	float add(float a, float b) {
		return a + b;
	}
	
	String add(String a , String b) {
		return a + b;
	}
}

public class 오버로딩 {

	public static void main(String[] args) {
		Add add = new Add();
		
		System.out.println(add.add(3, 4));
		System.out.println(add.add(1.3432f, 2.34235f));
		System.out.println(add.add(3, 4, 3));
		System.out.println(add.add("안녕", "하세요"));
	}

}
