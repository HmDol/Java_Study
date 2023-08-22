package day0807;

import java.util.Calendar;

class SingleTone{
	private int num;
	private String data;

	//클래스 안에서 static으로 객체생성 -> 공용으로 사용 = 싱글톤
	private static SingleTone st = new SingleTone(); 
	
	// 생성자가 private?? -> 클래스 밖에서는 생성 불가!!!
	private SingleTone(){} 
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	//싱글톤 객체를 외부에서 받을 수 있게 static형의 getInstance() 제공
	
	public static SingleTone getInstance() {
		return st;
	}

	
	
}

public class SingleToneTest {

	public static void main(String[] args) {
		//SingleTone s = new SingleTone(); ==> 호출 불가
		SingleTone s = SingleTone.getInstance();
		s.setNum(10);
		s.setData("asdf");
		System.out.println( "num : "+ s.getNum());
		System.out.println( "Data : "+ s.getData());

		
		Calendar c = Calendar.getInstance();//싱글톤의 대표적인 예시 calendar class
		System.out.print(c.getTime().getYear()+1900 + "년 ");
		System.out.println(c.getTime().getMonth()+1 + "월");
	}

}
















