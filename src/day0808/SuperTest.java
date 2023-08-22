package day0808;

class A{
	int num;
	
	public A(int num) {
		this.num = num;
	}
//	public A() {}
}

//부모 클래스가 파람이 있는 생성자만 존재 할 경우 자식 클래스의 생성자에서 전달해야함.
class B extends A{
	String str;
	
	public B(int num, String str) {
		super(num); // 부모 생성자 호출, 생성자 내에서 1줄로 작성
		this.str = str;
	}
}

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
