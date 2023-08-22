package day0808;

public class PocketMonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		포켓몬 pm = new 포켓폰(); //추상 클래스는 객체를 못 만듬
		PocketMonImpl p = new PocketMonImpl(0, 0, 0);
		p.eat();
		p.sleep();
		p.play();
		p.exc();
		p.allCheck();
	
	}

}
