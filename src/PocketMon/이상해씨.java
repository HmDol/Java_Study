package PocketMon;

public class 이상해씨 extends 포켓몬{
	
	
	public 이상해씨(String name, int hp, int exp, int lv) {
		super(hp, exp, lv);
		super.name = name;
	}
	
	public void eat() {
		super.eat();
		hp += 16;
		exp  += 25;
		lvCheck();
		allCheck();
	}
	
	public void sleep() {
		super.sleep();
		hp += 25;
		exp -= 15;
		lvCheck();
		allCheck();
	}
	
	public void play() {
		super.play();
		hp -= 24;
		exp += 35;
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
	
	public void 넝쿨공격() {
		System.out.println("넝쿨공격!!");
	}
	
	public void lvCheck() {
		if(exp >= 100) {
			super.exp = exp - 100;
			lv++;
		}
		else if(exp < 0) super.exp = 0;
	}
	
}
