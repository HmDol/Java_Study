package day0809;

class Test2{
	int num;
	String data;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Test2) {
			Test2 t = (Test2)obj;
			if(this.num==t.num && this.data.equals(t.data)) {
				return true;
			}
		}
		return	false;
	}
	
	

}

public class EqualsTest2 {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		t1.num = 1;
		t1.data = "aaa";
		
		Test2 t2 = new Test2();
		t2.num = 1;
		t2.data = "aaa";
		
		Test2 t3 = t1;
		
		System.out.println("t1.equals(t2) = " + t1.equals(t2)); // 참조값 비교
		System.out.println("t1 == t2: " + (t1 == t2)); // 참조값 비교
		
		System.out.println("t1.equals(t3) = " + t1.equals(t3));// 참조값 비교
		System.out.println("t1 == t3: " + (t1 == t3));// 참조값 비교
	
		
	
	}

}
