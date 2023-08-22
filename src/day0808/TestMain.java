package day0808;

interface A1{
	void test1();
}

interface B1{
	void test2();
}

//인터페이스 다중상속
class C implements A1, B1{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
	}
	
}


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.test1();
		c.test2();
	}

}