package PocketMon;

public class 피카츄 extends 포켓몬 {
	
	public 피카츄(String name, int hp, int exp, int lv) {
		super(hp, exp, lv);
		// TODO Auto-generated constructor stub
		super.name = name;
	}
	
	public void eat() {
		super.eat();
		hp += 20;
		exp  += 20;
		lvCheck();
		allCheck();
	}
	
	public void sleep() {
		super.sleep();
		hp += 15;
		exp -= 20;
		lvCheck();
		allCheck();
	}
	
	public void play() {
		super.play();
		hp -= 20;
		exp += 20;
		lvCheck();
		allCheck();
	}
	public void exc() {
		super.exc();
		hp -=  15;
		exp -= 15;
		lvCheck();
		allCheck();
	}
	
	//나중에 추가된 메소드 -> 다운케스팅을 이용해야함
	public void 백만볼트()	 {
		System.out.println("백만볼트!!");
	}
	
	public void lvCheck() {
		if(exp >= 100) {
			super.exp = exp - 100;
			lv++;
		}
		else if(exp < 0) super.exp = 0;
	}
	
}