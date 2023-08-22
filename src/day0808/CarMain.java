package day0808;

class Car{
	String name;
	public void horn() {
		System.out.println("경적소리");
	}
}

class 소방차 extends Car{
	public 소방차() {
		name ="소방차";
	}
	@Override
	public void horn() {
		super.horn();
		System.out.println("삐뽀삐뽀");
	}
	public void 진압() {
		System.out.println("진압");
	}
}

class 구급차 extends Car{
	public 구급차() {
		name ="구급차";
	}

	@Override
	public void horn() {
		super.horn();
		System.out.println("에에에에에엥");
	}
	public void 구조() {
		System.out.println("구조");
	}
}

class 경찰차 extends Car{
	public 경찰차() {
		name ="경찰차";
	}

	@Override
	public void horn() {
		super.horn();
		System.out.println("저놈 잡아~~~~~~~라~!~!~~");
	}
	
	public void 체포() {
		System.out.println("체포");
	}
}

class Handler{
	public void action(Car car) {
		System.out.println("");
		System.out.println("name : "+ car.name);
		car.horn();
	}
}

public class CarMain {
	public static void main(String[] args) {
//		다형성 1번 예시
//		Car c = new 경찰차();
//		c.horn();
//		c = new 소방차();
//		c.horn();
//		c = new 구급차();
//		c.horn();
		
		//다형성 2번 예 : 메서드의 파람으로 업캐스팅
//		Handler h = new Handler();
//		h.action(new Car());
//		h.action(new 경찰차());
//		h.action(new 소방차());
//		h.action(new 구급차());
		
		//다형성 3번 예 : 배열에 업캐스팅하여 저장
		//배열 타입을 부모타입으로 생성하면 다양한 자식 객체를 저장할 수 있음
		Car[] arr = {new Car(), new 경찰차(),new 소방차(),new 구급차()};
		for(int i = 0; i< arr.length; i++) {
			System.out.println("name : "+ arr[i].name );
			arr[i].horn();
			//추가된 메서드 호출
			switch(i) {
			case 0 :  
				System.out.println("뭐 없음");
				break;
			case 1 : 
				((경찰차)arr[i]).체포(); //다운 캐스팅
				break;
			case 2 :
				((소방차)arr[i]).진압();//다운 캐스팅
				break;
			case 3: 
				((구급차)arr[i]).구조();//다운 캐스팅
				break;
			}
			System.out.println();
		}
		
	}

}
