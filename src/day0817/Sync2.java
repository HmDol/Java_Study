package day0817;

class MyThread7 extends Thread{
	private Msg m;
	public MyThread7(Msg m) {
		this.m = m;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			processMsg(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void processMsg(int i) {
		//동기화 블록. 파라메터로 공유자원 받음
		synchronized(m) {
			m.writeMsg(getName() + "message[" + i + "]");
			try {
				sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			m.print();
		}
	}
}
public class Sync2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Msg m = new Msg();
		MyThread7[] ths = new MyThread7[5];
		for (int i = 0; i < ths.length; i++) {
			ths[i] = new MyThread7(m);
			ths[i].start();
		}
	}

}