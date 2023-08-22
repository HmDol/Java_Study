package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room = new Room();//채팅방
		try {
			ServerSocket ss = new ServerSocket(1234);
			System.out.println("채팅 서버 시작");
			while(true) {
				Socket socket = ss.accept();
				System.out.println("새 클라이언트 접속");
				//새 접속이 되면 클라이언트 처리 쓰레드를 룸에 추가
				ChatServerTh th = new ChatServerTh(socket, room);
				room.addClient(th);
				th.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}