package day0817;

//증가 쓰레드
class MyThread8 extends Thread {
	private Data data;

	public MyThread8(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			data.add(1);
		}
	}
}
//감소 쓰레드
class MyThread9 extends Thread {
	private Data data;

	public MyThread9(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			data.sub(1);
		}
	}
}

public class Sync3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		MyThread8 th1 = new MyThread8(data);
		MyThread9 th2 = new MyThread9(data);
		th1.start();
		th2.start();
	}

}