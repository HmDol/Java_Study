package day0817.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		try {
			//클라이언트가 접속 할 수 있게 서버소켓 오픈
			ServerSocket ss = new ServerSocket(2323);
			System.out.println("서버시작");
			while(true) {
				//클라이언트가 접근하면 1:1 통신할 소켓을 반환
				Socket socket = ss.accept(); // 클라이언트의 접속요청까지 기다림
//				socket.getInputStream();  소켓에서 읽는 스트림. 상대방이 보낸 데이터를 읽음
//				socket.getOutputStream(); 소켓에 출력 스트림. 내 데이터를 상대방에게 보냄
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in)); // 한글 깨진느 현상을 막음 + 버퍼
				PrintWriter pw = new PrintWriter(out, true); // 문자단위 출력에 유용한 보조 스트림, true : 버퍼를 출력해서 비움
				
				String str = br.readLine(); // 소켓에서 한줄 읽은 것
				System.out.println("클라이언트 메시지 : "+str);
				pw.println(str);
				pw.flush();
				//break;
				
			}
			//System.out.println("서버 종료");
			//ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
