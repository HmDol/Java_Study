package day0817.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoCllient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket;
		try {
			//서벙 연결 요청. 
			socket = new Socket("localhost",2323);
			
			//소켓에 읽고 쓸 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 한글 깨진느 현상을 막음 + 버퍼
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			//서버로 메시지 전송
			out.println("hello msg");
			out.flush();
			
			//서버가 에코로 보낸 메시지 받음
			String str = in.readLine();
			System.out.println("서버메시지: "  + str);

			//소켓닫음
			socket.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}	
	
	
	

}
