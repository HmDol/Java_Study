package day0808;

import java.awt.Frame;

class MyFrame extends Frame implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<11; i++) {
			this.setTitle("frame title: "+ i); // 프레임에 제목을 달아줌
			try {
				Thread.sleep(1000); // 1초 멈춤
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadMain {

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		Thread th = new Thread(mf);
		th.run();

	}

}
