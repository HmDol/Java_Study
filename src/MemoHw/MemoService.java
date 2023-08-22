package MemoHw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemoService {
	private String path;
	private File dir;
	
	public MemoService(String path) {
		this.path = path;
		dir = new File(path);
	}
	
	public void mkdir() {
		if(dir.exists()) {
			System.out.println("디렉 이미 존재함");
		}else {
			System.out.println("디렉 존재하지 않음. 생성함");
			dir.mkdir();
		}
	}
	
	public String selectFile(Scanner sc) {
		String[] list = dir.list();
		if(list.length == 0) {
			System.out.println("등록된 메모가 없다. 읽기 종료");
			return null;
		}
		System.out.print("memo 목록 : ");
		for(int i = 0; i < list.length; i++) {
			System.out.println(i +"." + list[i]);
		}
		System.out.println("일고싶은 파일 번호를 선택하세요");
		int num = -1;
		do {
			num = sc.nextInt();
		}while(num < 0 || num >= list.length);
		return list[num];
	}
	
	public void read(Scanner sc) {
		String fname = selectFile(sc);
		if(fname == null) {
			return;
		}
		try {
			FileReader fr = new FileReader(path + fname);
			int ch;
			while((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public String writeFname(Scanner sc) {
		System.out.println("작성할 파일명 : ");
		String fname = sc.next();
		String[] list = dir.list();
		for(String f:list) {
			if(fname.equals(f)) {
				System.out.println("중복된 파일명. 1.새파일명 2.이어쓰기 3.덮어쓰기");
				int n = sc.nextInt();
				
				switch(n) {
				case 1:
					fname = "";
					break;
				case 2:
					fname += "/a";
					break;
				case 3:
					fname += "/t";
					break;
				default :
					fname ="";
				}
				break;
			}
		}
		return fname;
	}
	
	public void write(Scanner sc) {
		String fname = ""; 
		while(true) {
			fname = writeFname(sc);
			if(!fname.equals("")) {
				break;
			}
		}
		String[] res = fname.split("/");
		String fn =  res[0];
		boolean flag = false;
		if(res.length > 1 && res[1].equals("a")) {
			flag = true;
		}
		StringBuilder sb =new StringBuilder();
		System.out.println("파일 내용 입력(멈추려면 /stop 입력");
		while(true) {
			String str = sc.nextLine();
			if(str.startsWith("/stop")) {
				break;
			}
			sb.append(str+"\n");
		}
		String s = sb.toString();
		try {
			FileWriter fw = new FileWriter(path+fn, flag);
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete(Scanner sc) {
		System.out.println("삭제할 파일 선택");;
		String fname = selectFile(sc);
		if(fname==null) {
			System.out.println("파일이 없다");
			return;
		}
		File delF = new File(path + fname);
		delF.delete();
	}
}