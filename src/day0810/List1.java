package day0810;

import java.util.ArrayList;

class Test{
	int x = 12;
	int y = 34;
	
	@Override
	public String toString() {
		return "[Test x :" + x + " / y : " + y + "]";
	}
}

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("asdf");
		list.add(12); // auto boxing
		list.add(34.56f); // auto boxing
		list.add(new Test());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
