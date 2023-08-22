package addr;

import java.util.Scanner;

public class Menu {
	private MemberService service;

	public Menu() {
		service = new MemberService();
		
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		int menu;
		while(flag) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체목록 6.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				service.addMember(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				service.printAll();
				break;
			case 6: 
				flag = false;
				break;
			}
		}
	}
}
