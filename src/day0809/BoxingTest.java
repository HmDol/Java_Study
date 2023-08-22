package day0809;



public class BoxingTest {

	public static void main(String[] args) {
		//모든 객체 타입을 저장(클래스는 모두 가능)
		
		Object[] arr = new Object[5];
		arr[0] = "aaa"; // String
		arr[1] =  5;//int -> Integer : auto boxing
		arr[2] = 4.5f;//float -> Float
		arr[3] = new Test();
		arr[4] = new Test2();

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		((Test)arr[3]).num = 10;
		((Test)arr[3]).data = "bbb";
		System.out.println(((Test)arr[3]).data);
		System.out.println(((Test)arr[3]).num);
		System.out.println(arr[4]);
	}

}
