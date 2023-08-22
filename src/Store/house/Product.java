package Store.house;

//번호, 상품명, 가격, 수량
public class Product {

	private int num;// 자동할당
	private String name;
	private int price;
	private int amount;
	private static int cnt;

	public Product() {
	}

	public Product(String name, int price, int amount) {// 제품 등록시에만 사용
		this.num = ++cnt;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public Product(int num, String name, int price, int amount) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}

}