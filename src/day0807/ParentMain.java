package day0807;

class GrandParent{
	String name;
	public GrandParent() {
		name = "GrantParent";
		System.out.println("grantparent 생성자");
	}
	
	public void method(){
		System.out.println("name : "+name);
	}
}

class Parent extends GrandParent{
	int age;
	public Parent() {
		name = "parent";
		age = 23;
		System.out.println("parent 생성자");
	}
	public void method(){
		super.method();
		System.out.println("age : " + age);
		
	}
}

class Child extends Parent{
	String hobby;
	public Child() {
		name="child";
		age = 12;
		hobby="공놀이";
		System.out.println("child 생성잔");
	}
	
	public void method() {
		super.method();
		System.out.println("hobby : " + hobby);
	}
}

public class ParentMain {

	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		gp.method();
		System.out.println("==========================");
		
		Parent p = new Parent();
		p.method();
		System.out.println("==========================");
		
		Child c = new Child();
		c.method();
		System.out.println("==========================");

	}

}
