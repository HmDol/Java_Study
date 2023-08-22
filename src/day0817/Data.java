package day0817;
//조건: 20 - 40
public class Data {
	private int num = 0;

	public synchronized void add(int x) {
		num += x;
		System.out.println("증가 실행, num=" + num);
		if (num >= 40) {
			notifyAll();//wait으로 대기중인 모든 쓰레드 깨움
			try {
				System.out.println("증가 쓰레드 wait");
				wait();//스스로 대기 상태 들어감
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void sub(int x) {
		num -= x;
		System.out.println("감소 실행, num=" + num);
		if (num <= 20) {
			notifyAll();//대기중인 쓰레드 모두 깨움
			try {
				System.out.println("감소 쓰레드 wait");
				wait();//스스로 대기 상태 들어감
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}