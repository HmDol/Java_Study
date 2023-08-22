package day0817.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//키보드 입력 받아서 상대방에 메시지 전송
class WriteTh extends Thread {
	private PrintWriter out;//소켓에 출력 스트림
	private Scanner sc; //키보드 입력
	private String name; //유저 이름

	public WriteTh(PrintWriter out, Scanner sc, String name) {
		this.out = out;
		this.sc = sc;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			//키보드 입력
			String str = sc.nextLine();
			// 소켓에 출력 => 상대방에게 전송
			out.println(name + ":" + str);
			out.flush();//버퍼 강제 출력
			if (str.startsWith("/stop")) {//종료 메시지
				break;//쓰레드 종료
			}
		}
	}

}

//상대방 메시지 읽는 쓰레드
class ReadTh extends Thread {
	private BufferedReader in;//소켓 읽기 스트림

	public ReadTh(BufferedReader in) {
		this.in = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				// 소켓에서 한줄 읽음
				String str = in.readLine();
				String s = str.split(":")[1];
				if (s.startsWith("/stop")) {//메시지 내용이 /stop이면
					System.out.println("상대방이 채팅 종료를 요청했습니다. 채팅을 종료합니다");
					break;//쓰레드 종료
				}
				System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ChatServerOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss;
		try {
			// 서버소켓 오픈
			ss = new ServerSocket(1234);
			System.out.println("서버시작");

			// 클라이언트 접속 대기
			Socket socket = ss.accept();

			// 소켓 입출력 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());

			// 상대방 메시지 읽는 쓰레드 생성
			ReadTh th1 = new ReadTh(in);

			// 키보드 입력받아서 소켓에 출력하는 쓰레드 생성
			WriteTh th2 = new WriteTh(out, new Scanner(System.in), "server");

			// 쓰레드 실행
			th1.start();
			th2.start();

			// join(): 파생 쓰레드가 종료할때까지 기다림
			th1.join();
			th2.join();

			socket.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
