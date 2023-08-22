package chat;

import java.util.ArrayList;

//채팅방 클래스 
public class Room {
	private ArrayList<ChatServerTh> list;

	public Room() {
		list = new ArrayList<>();
	}

	// 채팅방에 유저 추가
	public void addClient(ChatServerTh th) {
		list.add(th);
	}

	// 채팅방에서 유저 삭제
	public void delClient(ChatServerTh th) {
		list.remove(th);
	}

	// 채팅방에 있는 모든 유저에 메시지 전송
	public void sendMsgAll(String msg) {
		for (ChatServerTh th : list) {
			th.writeMsg(msg);
		}
	}
}