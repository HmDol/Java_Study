package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//클라이언트 1명 전담
//전담한 클라이언트가 보낸 메시지를 받아서 다시 보냄
public class ChatServerTh extends Thread {
	private Socket socket;// 연결된 클라이언트와 1:1 통신하는 소켓
	private BufferedReader in;
	private PrintWriter out;
	private Room room;
	private String name;

	public ChatServerTh(Socket socket, Room room) {
		this.room = room;
		this.socket = socket;
		// 소켓에 연결된 상대방 주소값 받아옴
//		InetAddress addr = this.socket.getInetAddress();
//		name = addr.getHostAddress();
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 연결된 클라이언트 1명에게 메시지 전송
	public void writeMsg(String msg) {
		out.println(msg);
		out.flush();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// 닉네임 받아와서 name에 할당
			name = in.readLine();
			System.out.println("name:" + name);
			room.sendMsgAll(name + " 님이 입장하셨습니다");
			while (true) {

				// 연결된 1명의 클라이언트가 메시지 보낸것 읽기
				String str = in.readLine();
				// 채팅방에 있는 모두에게 메시지 전송
				//////////////////////////
				if (str.startsWith("/stop")) {
					writeMsg("/stop");
					room.delClient(this);
					room.sendMsgAll(name + " 님이 퇴장하셨습니다");
					break;
				}
				System.out.println(name + ":" + str);
				room.sendMsgAll(name + ":" + str);
			}
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}