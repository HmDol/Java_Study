package day0808;

class Parent{
	int x;
	
	public void method() {
		System.out.println("x: " + x);
	}
}

class Child extends Parent{
	int  y;
	
	@Override//메서드 재정의.
	public void method() {
		// TODO Auto-generated method stub
		super.method();
		System.out.println("y: "+ y);
	}
	
}

public class ParentMain {


	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method();
		
		Child c = new Child();
		c.method();
		
		Parent p2 = new Child();
		p2.method();
		
		((Child)p2).y = 10;
		p2.method();
		

	}

}
