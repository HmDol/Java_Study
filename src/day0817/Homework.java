package day0817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//키보드 입력
class InputTh extends Thread {
	private Scanner sc;

	public InputTh(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.print("메시지 입력(종료는 /stop):");
			String str = sc.nextLine();
			if (str.startsWith("/stop")) {
				break;
			}
			System.out.println(str);
		}
		System.out.println("메시지 입력 쓰레드 종료");
	}
}

class FileRead extends Thread {
	private String path;

	public FileRead(String path) {
		this.path = path;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				System.out.println("파일내용:" + str);
				sleep(1000);
			}
			System.out.println("파일 읽기 쓰레드 종료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputTh th1 = new InputTh(new Scanner(System.in));
		FileRead th2 = new FileRead("src/day0817/Homework.java");
		th1.start();
		th2.start();
	}

}