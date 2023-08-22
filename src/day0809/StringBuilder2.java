package day0809;

public class StringBuilder2 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("aaa");
		sb.append("bbb");
		sb.append("ccc");
		System.out.println(sb.toString());
		sb.insert(1, "kkk");
		System.out.println(sb.toString());
		sb.replace(1, 3, "ttt");
		System.out.println(sb.toString());
		sb.delete(1, 3);
		System.out.println(sb.toString());
	
	}
}
