package day0809;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "asdf"; // 문자열 상수는 주소 
		String b = new String(a);
		String c = new String("bbbbb");
		char[] d = {'a', 'p','p','l','e'};
		String e = new String(d);
		String f = "asdf";// 동일한 문자열 상수는 하나만 만들어서 공용을 사용
		
		f += "qwer"; // f = "asdf"+"qwer'
		
		String str1 = "aaa" + 123;
		String str2 = 123 + "bbb";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		
		System.out.println("a : " + a);
		System.out.println("a : " + b);
		System.out.println("a : " + f);
		System.out.println("a == b : " + (a==b) );
		System.out.println("a.equals(b) : " + a.equals(b) );
		System.out.println("a == f : " + (a==f) );
		System.out.println("a.equals(f) : " + a.equals(f) );
		
		System.out.println("------------------");
		System.out.println(f);
		System.out.println(d);
		
				
	}
}


