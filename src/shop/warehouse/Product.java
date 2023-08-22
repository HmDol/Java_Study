package shop.warehouse;

public class Product {
	
	private int num;// 자동할당
	private String name;
	private int price;
	private int amount;
	private static int cnt;
	
	//번호가 같으면 같은 객체
	//arrayList의 contains(0, indexof(), remove()를 사용하려면 equals 재저의해야함
	// 만약 add, get, for문만 사용할 거면 재정의 필요 없음
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Product) {
			Product p = (Product) obj;
			if(num == p.num) {
				return true;
			}
		}
		return false;
	}
	
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
