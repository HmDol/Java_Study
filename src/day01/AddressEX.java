package day01;

class AddressList {
	String name;
	String phoneNum;
	String address;
	
	void printList() {
		System.out.println(this.name + "/" + this.phoneNum + "/" + this.address);
		
	}
}

public class AddressEX {
	public static void main(String[] args) {
		AddressList al1 = new AddressList();
		AddressList al2 = new AddressList();
		
		al1.name = "aaa";
		al1.phoneNum = "1111-111";
		al1.address = "대구";

		al2.name = "bbb";
		al2.phoneNum = "222-2222";
		al2.address = "경산";
		
		
		System.out.println("이름/  전화번호 / 주소");
		al1.printList();
		al2.printList();
		
	}
	
	
}
