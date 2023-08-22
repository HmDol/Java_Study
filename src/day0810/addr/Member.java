package day0810.addr;

public class Member {
	//private : 클래스 밖에서 안보임. so setter getter를 제공해야함
	private String name;
	private String tel;
	private String address;


	//생성자
	public Member() {
		
	}
	
	//초기화하는 생성자
	public Member(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(m.name.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
