package day0817.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClientOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//서버연결
			Socket socket = new Socket("localhost", 1234);
			
			// 소켓 입출력 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());

			// 상대방 메시지 읽는 쓰레드 생성
			ReadTh th1 = new ReadTh(in);

			// 키보드 입력받아서 소켓에 출력하는 쓰레드 생성
			WriteTh th2 = new WriteTh(out, new Scanner(System.in), "client");

			// 쓰레드 실행
			th1.start();
			th2.start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}