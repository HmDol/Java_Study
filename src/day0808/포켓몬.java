package day0808;


public abstract class 포켓몬 {
	protected int hp;
	protected int exp;
	protected int lv;
	protected  String name;
	
	public 포켓몬(int hp, int exp, int lv) {
		this.hp = hp;
		this.exp = exp;
		this.lv = lv;
	}
	

	//추상메서드. 메서드에 틀만 존재하고 상속받는 
	//하위클래스에서 적합하게 재정의해서 써라!!
	public abstract void eat();
	public abstract void sleep(); 
	public abstract void play();
	public abstract void exc();
	public void allCheck(){
		System.out.println("======================");
		System.out.println("hp : " + hp);
		System.out.println("exp : " + exp);
		System.out.println("lv : " + lv);
		System.out.println("======================");
		
	}
    //	----> 추상 메서드
}


