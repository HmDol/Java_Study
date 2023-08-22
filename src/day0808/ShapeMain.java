package day0808;

class Point{
	int x;
	int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { //객체를 설명하는 메서드(object 메서드). 타입@참조값 -> 밑의 정의로 변경하는 것
		return "Point [" + x + ", " + y + "]";
	}
	
}

abstract class Shape{
	protected Point[] points;
	public abstract void draw();
	
}

class Circle extends Shape{
	private int r;
	
	public Circle() {
		r =10;
		points = new Point[] {new Point(5,5)};
	}
	
	@Override
	public void draw() {
		System.out.println("반지름 : " + r);
		System.out.println("중심점 : " + points[0]);
		System.out.println("의 원을 그린다.");
		
	}
}
	
class Rect extends Shape{
	public Rect() {
		points = new Point[] {new Point(5,5),new Point(12,23)};
	}
	
	@Override
	public void draw() {
		System.out.println("사각형 그림");
		for(int i = 0; i< points.length; i++) {
			System.out.println(points[i]);
		}
	}
}

class Tri extends Shape{
	
	public Tri() {
		points = new Point[] {new Point(5,5),new Point(7,8), new Point(45,67)};
	}
	
	@Override
	public void draw() {
		System.out.println("삼각형 그림");
		for(int i = 0; i< points.length; i++) {
			System.out.println(points[i]);
		}
	}
}


public class ShapeMain {

	public static void main(String[] args) {
		Shape[] arr = {new Circle(), new Tri(), new Rect()};
		

	}

}
