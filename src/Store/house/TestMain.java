package Store.house;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductService s = new ProductService();
		s.productAdd(sc);
	}

}