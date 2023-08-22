package day0817;

class MyThread4 extends  Thread	{

	@Override
	public void run() { // 쓰레드 작업은 run()에구현. run()에 작성된 코드가 끝나면 그 쓰레드는 종료
		// TODO Auto-generated method stub
		System.out.println(getName() + " 시작 / 우선순위: " + this.getPriority());
		for(int i=0; i<100; i++) {
			System.out.println(getName() + ": " + i +"번째 작업");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println(getName() + " 종료 / 우선순위: " + getPriority());
	}
}	

public class MyThreadMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread[] ths = new Thread[10];
		for(int i =0; i<ths.length; i++) {
			ths[i] = new MyThread4();
			ths[i].setPriority(i+1);
			ths[i].start();
		}
		
		System.out.println("main 쓰래드");
		System.out.println("Thread.MIN_PRIORITY : " + Thread.MIN_PRIORITY );
		System.out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY );
		System.out.println("Thread.MAX"
				+ "_PRIORITY : " + Thread.MAX_PRIORITY );
	}

}
