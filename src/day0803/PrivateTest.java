package day0803;

class Test5{
	private String name;
	private int age;
	//priavte 맴버는 일기 메서드(getter), 스기 메서드(setter) 제공되어야 한다.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()	{
		return "TEST5[name=" + name + " / age : " + age +"]";
	}
	
}

public class PrivateTest {

	public static void main(String[] args) {
		Test5 test = new Test5();
		test.setAge(10);
		test.setName("김힘찬");
		
		System.out.println(test);

	}

}
