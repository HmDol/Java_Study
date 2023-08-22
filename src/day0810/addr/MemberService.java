package day0810.addr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.ObjectOutputStream;

public class MemberService {
	private MemberDao dao;
	private String path = "src/day0810/addr/data.datas";
	
	public MemberService() {
		dao = new MemberDao();
	}
	
	public void start() {
		try {
			//File : 파일에 대한 정보를 가짐
			File f = new File(path);
			if(!f.exists()) {
				System.out.println("처음실행. 읽을 데이터 없음");
				return;
			}
			FileInputStream fi = new FileInputStream(path);
			ObjectInputStream oi = new ObjectInputStream(fi);
			while(true) {
				Member m = (Member) oi.readObject(); // 파일에서 객체 하나 읽음
				dao.insert(m); // arraylist에 추가
				if(fi.available()<10) { // 스트림 잔량 체크해서 10보다 작게 남았으면
					break;
				}
			}
			oi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void stop() {
		
		try {
			FileOutputStream fo = new FileOutputStream(path);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			for(Member m : dao.getList()) {
				oo.writeObject(m);
			}
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addMember(Scanner sc) {
		//이름 중복 안됨
		System.out.println("-------------추가---------------");
		String name = "";
		Member m = null;
		do {
			System.out.println("name : ");
			name = sc.next();
			m = dao.selectByNm(name);
		}while( m != null);
		
		System.out.println("tel : ");
		String tel = sc.next();
		System.out.println("addrress: ");
		String address = sc.next();
		
		dao.insert(new Member(name,tel,address));
		
	}
	
	public void delMember(Scanner sc) {
		System.out.println("-------------삭제---------------");
		System.out.println("삭제할 이름 : ");
		String name = sc.next();
		Member m = dao.selectByNm(name);
		if(m == null) {
			System.out.println("해당 주소록이 없습니다. 삭제불가!");
		}else {
			dao.delete(m);
		}
				
	}
	
	public void printAll() {
		dao.selectAll();
	}
	
	public void printMember(Scanner sc) {
		System.out.println("-------이름 검색=------------");
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		Member m = dao.selectByNm(name);
		if(m==null) {
			System.out.println("없음");
		}else {
			System.out.println(m);
		}
	}
	
	public void editMember(Scanner sc) {
		System.out.println("-------이름 검색=------------");
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		Member m = dao.selectByNm(name);
		if(m==null) {
			System.out.println("없음");
		}else {
			System.out.println("tel : ");
			String tel = sc.next();
			System.out.println("addrress: ");
			String address = sc.next();
			dao.update(new Member(name,tel,address));
		}
	}
}
