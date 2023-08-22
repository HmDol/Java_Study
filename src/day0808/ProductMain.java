package day0808;

import java.util.Scanner;

class Product{
	String name;
	int price;
	int point;
	
}

class Tv extends Product{
	public Tv() {
		name = "tv";
		price = 1000;
		point = 100;
	}
}

class Audio extends Product{
	public Audio() {
		name = "Audio";
		price = 2000;
		point = 200;
	}
}

class Computer extends Product{
	public Computer() {
		name = "Computer";
		price = 3000;
		point = 300;
	}
}

class Buyer {
	int money = 10000;
	int point = 0;
	//제품 구매 메서드 작성
	//구매시 money 제품 가격만큼 차감 / 포인트 적립/ 돈 모자르면 취소
	
	public void buy(Product p) { // 구매 메서드
		if(money < p.price) System.out.println("잔액부족으로 취소!");
		else {
			money -= p.price;
			point += p.point;
			System.out.println(p.name + " 구매 완료!");
		}
	}
	
	public void view() {
		System.out.println("money : " + money);
		System.out.println("point : " + point);
	}
}


public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] arr = {new Tv(), new Audio(), new Computer()};
		Buyer b = new Buyer();
		
		int num = 0;
		
		while(num != -1) {
			System.out.println("1.티비/2.오디오/3.컴퓨터/-1.취소");
			System.out.print("무엇을 구매하시나요? : ");
			num = sc.nextInt(); 
			
			switch(num) {
			case 1:
				b.buy(arr[0]);
				b.view();
				break;
			case 2:
				b.buy(arr[1]);
				b.view();
				break;
			case 3:
				b.buy(arr[2]);
				b.view();
				break;
			case -1 : break;
			default :  
				System.out.println("번호 확인하세요");
				break;
			}
			System.out.println("------------------------------------");
		}
	}

}
