package PocketMon;

public class 포켓몬 {
	protected int hp;
	protected int exp;
	protected int lv;
	protected  String name;
	
	public 포켓몬(int hp, int exp, int lv) {
		this.hp = hp;
		this.exp = exp;
		this.lv = lv;
	}
	
	public void eat() {
		System.out.println(name + " 밥먹기");	
	}
	public void sleep() {
		System.out.println(name + " 잠자기");	
	}
	public void play() {
		System.out.println(name + " 놀기");	
	}
	public void exc() {
		System.out.println(name + " 운동하기");	
	}
	
	public void allCheck() {
		System.out.println("======================");
		System.out.println("hp : " + hp);
		System.out.println("exp : " + exp);
		System.out.println("lv : " + lv);
		System.out.println("======================");
		
	}
}
