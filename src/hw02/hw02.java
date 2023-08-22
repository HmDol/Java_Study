package hw02;

import java.util.Scanner;


class Address{
	String name;
	String phoneNum;
	String addr;
	static int cnt;// 등록된 주소록 갯수
	
	Scanner sc1 = new Scanner(System.in);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void add(){
		System.out.print("이름 입력: ");
		name = sc1.nextLine();
		System.out.print("전화번호 입력: ");
		phoneNum = sc1.nextLine();
		System.out.print("주소 입력: ");
		addr = sc1.nextLine();
		cnt++;
	}
}

public class hw02 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address[] addrList = new Address[100];
		String search; // 검색변수
		
		while(true){
			System.out.println("\n\n1.추가 2.검색 3.수정 4.삭제 5.전체목록 (나가기 : -1)");
			System.out.print("다음 중 할일을 선택하세요 : ");
			int num = sc.nextInt();
			if(num == -1) break; // while 나가기
			
			switch(num) { // 작업 선택
			case 1 :  // 추가
				addrList[Address.cnt] = new Address();
				addrList[Address.cnt].add();
				break;
				
			case 2 : // 검색
				sc.nextLine(); // 버퍼 비우기
				System.out.print("검색할 이름 입력 : ");
				search = sc.nextLine();
				int i;
				for( i = 0; i < Address.cnt; i++) {
					if(addrList[i].getName().equals(search)) {
						System.out.println("검색한 키워드는 " + i + "번째 있습니다.");
						break;
					}
				}
				if(i == Address.cnt) System.out.println("검색한 키워드는 없습니다.");
				break;
				
			case 3 : // 수정
				sc.nextLine(); // 버퍼비우기
				System.out.print("수정할 주소록 이름 : ");
				search = sc.nextLine(); 
				for( i = 0; i < Address.cnt; i++) {
					if(addrList[i].getName().equals(search)) {
						System.out.println("수정할 내용을 입력해주세요");
						System.out.print("이름 : ");
						addrList[i].name = sc.nextLine();
						System.out.print("번호 : ");
						addrList[i].phoneNum = sc.nextLine();
						System.out.print("주소 : ");
						addrList[i].addr = sc.nextLine();
						System.out.println("수정 완료!");
						break;
					}
				}
				break;
			case 4 : // 삭제
				sc.nextLine();//버퍼 비우기용
				if(Address.cnt == 0) {System.out.println("배열이 비어있음"); break;}
				System.out.print("삭제할 주소록의 이름 : ");
				search = sc.nextLine(); 
				for( i = 0; i < Address.cnt; i++) {
					if(addrList[i].getName().equals(search)) {
						for(int j = i; j < Address.cnt; j++) {
							addrList[j] = addrList[j+1];
						}
						break;
					}
				}
				Address.cnt--;
				break;
				
			case 5 : // 목록
				System.out.println("총 배열 길이 : " + Address.cnt);
				for( i =0; i < Address.cnt; i++) {
					System.out.println("--------------------------");
					System.out.println("이름 : " + addrList[i].name);
					System.out.println("번호 : " + addrList[i].phoneNum);
					System.out.println("주소 : " + addrList[i].addr);
					System.out.println("--------------------------");
				}
				break;
				
			default : System.out.println("\n*번호를 다시 확인해주세요*"); // 다른 값 입력 시
			}
		}
	}

}
