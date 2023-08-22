package day0817;

class MyThread3 implements Runnable {
	
	@Override
	public void run() { // 쓰레드 작업은 run()에구현. run()에 작성된 코드가 끝나면 그 쓰레드는 종료
		// TODO Auto-generated method stub
		for(int i=0; i<30; i++) {
			System.out.println(i +"번째 작업");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableTest {

	public static void main(String[] args) {
		
		MyThread3 r = new MyThread3();//인터페이스 구현 객체
		Thread th = new Thread(r); // Thread 객체에 생성해서 생성자에 runnable을 넣어줘야함
		th.start();

	}

}
