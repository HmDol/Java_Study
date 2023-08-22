package day0809;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefghide";
		String b ="123";
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("a.charAt(3):" + a.charAt(3));
		System.out.println("a.concat(b):" + a.concat(b));
		System.out.println("a.contains(\"de\"):" + a.contains("de"));
		System.out.println("a.indexOf(\"de\"):" + a.indexOf("de"));
		System.out.println("a.lastIndexOf(\"de\"):" + a.lastIndexOf("de"));
		System.out.println("a.startsWith(\"ab\"):" + a.startsWith("ab"));
		System.out.println("a.endsWith(\"ide\"):" + a.endsWith("ide"));
		System.out.println("a.replace(\"abc\",\"xyz\"):" + a.replace("abc", "xyz"));
		
		
	}

}
