package day0809;

class Num{
	private int num;
	
	public void setNum(int num) throws MyException {
		if(num<5) { // 조건이 만족하지 않으면
			//예외발생시킴
			throw new MyException("숫자는 5이상 이어야함");
		}else {
			this.num = num;
		}
	}
	
	public int getNum() {
		return num;
	}
}

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}

public class ThrowTest {

	public static void main(String[] args) {
	
		Num n = new Num();
		
		try {
			n.setNum(8);
			System.out.println("num : " + n.getNum());
			n.setNum(3);
			System.out.println("num : " + n.getNum());
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("stop");
	}
	
}
