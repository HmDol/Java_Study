package MemoHw;

import java.util.Scanner;

public class Menu {
	private MemoService service;
	public Menu() {
		service = new MemoService("src/MemoHw/files/");
	}
	
	public void run(Scanner sc) {
		service.mkdir();
		boolean flag = true;
		
		while(flag) {
			System.out.println("1.읽기 2.쓰기 3.삭제 4.종료");
			int m = sc.nextInt();
			switch(m) {
			case 1 : 
				service.read(sc);
				break;
			case 2 :
				service.write(sc);
				break;
			case 3 :
				service.delete(sc);
				break;
			case 4 :
				flag = false;
				break;
			
				
			}
		}
	}
}
