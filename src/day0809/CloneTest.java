package day0809;

class Test3 implements Cloneable{
	int num;
	String data;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class CloneTest {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.num=3;
		t.data="asdf";
		try {
			Test3 t2 = (Test3) t.clone();
			System.out.println("t : " + t);
			System.out.println("t2 : " + t2);
			System.out.println("t.num : " + t.num  + " / t.data : " + t.data);
			System.out.println("t2.num : " + t2.num  + " / t2.data : " + t2.data);
			System.out.println("t.hashcode() : " + t.hashCode());
			System.out.println("t2.hashcode() : " + t2.hashCode());
			
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
