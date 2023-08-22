package day0816.threadTest;

class MyThread1 extends Thread{

	@Override
	public void run() { // 쓰레드 작업은 run()에구현. run()에 작성된 코드가 끝나면 그 쓰레드는 종료
		// TODO Auto-generated method stub
		for(int i=0; i<30; i++) {
			System.out.println(getName() + ": " + i +"번째 작업");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
class MyThread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char i='a'; i<='z'; i++) {
			//getName() : 쓰레드 이름 반환
			System.out.println(getName() + ": " + i +"번째 작업");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

public class MyThreadTest  {

	public static void main(String[] args) {
		
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		MyThread1 th3 = new MyThread1();
		MyThread2 th4 = new MyThread2();
		
		th1.start(); //쓰레드 레디 상태로 만듦 
		th2.start();
		th3.start();
		th4.start();
	}

}
