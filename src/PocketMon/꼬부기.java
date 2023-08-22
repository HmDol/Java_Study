package PocketMon;

public class 꼬부기 extends 포켓몬 {
	public 꼬부기(String name, int hp, int exp, int lv) {
		super(hp, exp, lv);
		// TODO Auto-generated constructor stub
		super.name = name;
	}
	
	public void eat() {
		super.eat();
		hp += 18;
		exp  += 18;
		lvCheck();
		allCheck();
	}
	
	public void sleep() {
		super.sleep();
		hp += 14;
		exp -= 22;
		lvCheck();
		allCheck();
	}
	
	public void play() {
		super.play();
		hp -= 23;
		exp += 21;
		lvCheck();
		allCheck();
	}
	public void exc() {
		super.exc();
		hp -=  17;
		exp -= 20;
		lvCheck();
		allCheck();
	}
	
	public void 물대포() {
		System.out.println("물대포!!!");
	}
	
	public void lvCheck() {
		if(exp >= 100) {
			exp = exp - 100;
			lv++;
			
		}
		else if(exp < 0) super.exp = 0;
	}
	
}
