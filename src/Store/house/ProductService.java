package Store.house;

import java.util.Scanner;

//기능 구현. 
//서비스에서 배열에 저장하는 작업을 하려면
//dao 객체 필요 => 멤버변수로 정의
public class ProductService {
	private ProductDao dao;

	public ProductService() {
		dao = new ProductDao();
	}

	public void productAdd(Scanner sc) {
		System.out.println("===상품등록===");
		System.out.print("상품명:");
		String name = sc.next();
		System.out.print("가격:");
		int price = sc.nextInt();
		System.out.print("수량:");
		int amount = sc.nextInt();
		Product p = new Product(name, price, amount);
		boolean flag = dao.insert(p);
		if (flag) {
			System.out.println("정상추가 되었음");
		} else {
			System.out.println("추가 실패");
		}
	}
}