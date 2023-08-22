package day0808;

class MyInterfaceImpl implements MyInterface{ //구현이 완료 되면 객체를 가질 수 있음

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1 구현");
	}

	@Override
	public void test2(String str) {
		// TODO Auto-generated method stub
		System.out.println("test2 구현 " + str);
	}
	
}

public class MyInterfaceMain {

	public static void main(String[] args) {
		MyInterfaceImpl m = new MyInterfaceImpl();
		System.out.println("val : "+ MyInterface.VAL);
		m.test1();
		m.test2("통과");

	}

}
