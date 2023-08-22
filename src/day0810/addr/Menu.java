package day0810.addr;

import java.util.Scanner;

public class Menu {
	private MemberService service;

	public Menu() {
		service = new MemberService();
		
	}
	
	public void run(Scanner sc) {
		service.start();
		boolean flag = true;
		String menu;
		
		while(flag) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체목록 6.종료");
			menu = sc.next();
			switch(menu) {
			case "1":
				service.addMember(sc);
				break;
			case "2":
				service.printMember(sc);
				break;
			case "3":
				service.editMember(sc);
				break;
			case "4":
				service.delMember(sc);
				break;
			case "5":
				service.printAll();
				break;
			case "6": 
				service.stop();
				flag = false;
				break;
			default : 
				System.out.println("다른 값을 입력하세요 ");
				break;
			}
			
		}
	}
}
