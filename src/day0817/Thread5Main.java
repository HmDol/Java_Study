package day0817;
class Msg{
	private String str = "default message";
	public void print() {
		System.out.println(str);
	}
	public void writeMsg(String str) {
		this.str = str;	
	}
}

class MyThread5 extends Thread{
	private Msg m;
	public MyThread5(Msg m ) {
		this.m = m;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10; i++) {
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

public class Thread5Main {

	public static void main(String[] args) {
		Msg m = new Msg();
		MyThread5[] ths = new MyThread5[5];
		for(int i=0;i<ths.length;i++) {
			ths[i] = new MyThread5(m);
			ths[i].start();
		}
		
	}

}
