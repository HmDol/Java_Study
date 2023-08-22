package day0817;

class MyThread6 extends Thread{
	private Msg2 m;
	public MyThread6(Msg2 m) {
		this.m = m;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 10; i++) {
				m.writeMsg(getName() + "message[" + i + "]");
				sleep(i);
				m.print();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Sync1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Msg2 m = new Msg2();
		MyThread6[] ths = new MyThread6[5];
		for (int i = 0; i < ths.length; i++) {
			ths[i] = new MyThread6(m);
			ths[i].start();
		}
	}

}
class Msg2 {
	private String str = "default message";

	public void print() {
		System.out.println(str);
	}

	//이 메서드가 동작하는 동한에 다른 쓰레드 접근을 막아줌
	public synchronized void writeMsg(String str) {
		this.str = str;
	}
}