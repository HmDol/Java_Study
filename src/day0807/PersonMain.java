package day0807;

class Person{
	String num;
	String name;
	String dept;
	
	public void printInfo() {
		System.out.print("num : " + num + " / name : " + name + " / 부서(학과) : " + dept);
	}
}

class 학생 extends Person{
	String[] 수강과목 = new String[10];
	public void printInfo() {
		super.printInfo();
		System.out.println(" / 수강과목 : " + 수강과목[0]);
		
	}
}
class 교직원 extends Person{
	String job;
	public void printInfo() {
		super.printInfo();
		System.out.println(" / job : " + job);
		
	}
}
class 교수 extends Person{
	String[] 개설과목 = new String[10];
	public void printInfo() {
		super.printInfo();
		System.out.println(" / 개설과목 : " + 개설과목[0]);
	}
}

class Test{
	Person p = new Person();
	String temp;
}

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.num = "1";
		p1.name = "person";
		p1.dept = "부모";
		
		학생 s = new 학생();
		s.num = "2";
		s.name = "학생";
		s.dept = "컴퓨터";
		s.수강과목[0] = "전산";
		
		교직원 st = new 교직원(); 
		st.num = "3";
		st.name = "교직원";
		st.dept = "hr";
		st.job = "서류";	

		교수 pr = new 교수();
		pr.num = "4";
		pr.name = "교수";
		pr.dept = "전자";
		pr.개설과목[0] = "회로이론";
		
//		Test t = new Test();
//		t.num = "5";
//		p.name = "테스트";
//		t.dept = "테스트학과";
//		t.temp = "temp";
//		
		p1.printInfo();
		System.out.println();
		s.printInfo();
		st.printInfo();
		pr.printInfo();
//		t.printInfo();
		
		
		

	}

}
