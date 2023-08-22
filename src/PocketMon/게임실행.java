package PocketMon;

import java.util.Scanner;

public class 게임실행 {

	public static void run(포켓몬 p, int select){ // 업 케스팅
		Scanner s = new Scanner(System.in);
		boolean t = true;
		while(t) {
			if(p.hp <= 0) {System.out.println("포켓몬 사망ㅠㅠ"); break;}
			System.out.println("(1. 밥먹기/2.잠자기/3.운동하기 / 4. 놀기/ 5. 상태확인/ 6. 특기공격 7.종료)");
			System.out.print("작업을 선택해주세요 : ");
			int num = s.nextInt();
			
			switch(num) {
			case 1 : 
				p.eat();
				break;
			case 2: 
				p.sleep();
				break;
			case 3:
				p.exc();
				break;
			case 4: 
				p.play();
				break;
			case 5 : 
				p.allCheck();
				break;
			case 6 :
				if(select == 1) ((피카츄)p).백만볼트();
				if(select == 2) ((꼬부기)p).물대포();
				if(select == 3) ((이상해씨)p).넝쿨공격();
				break;
			
			case 7: 
				System.out.println("게임을 종료합니다.");
				t = false;
				break;
			 
			default: 
				System.out.println("번호를 확인하세요");
			
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.피카츄   2.꼬부기   3.이상해씨");
		System.out.print("캐릭터를 선택해주세요 : ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1: 
			피카츄 p1 = new 피카츄("피카츄",80, 90, 1);
			run(p1, select);
			break;
		case 2:
			꼬부기 p2 = new 꼬부기("꼬부기",90, 80, 1);
			run(p2, select);
			break;
		case 3:
			이상해씨 p3 = new 이상해씨("꼬부기",100, 90, 1);
			run(p3, select);
			break;
		
		default : 
			System.out.println("번호를 확인하세요");
		}
		

	}

}
