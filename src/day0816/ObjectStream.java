package day0816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//ObjecInputStream, ObjectOutputStream 의 대상이 되는 파일이 직렬화 처리가 되어 있어야함
class Member implements Serializable{
	String name;
	int age;
	Member(){}
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}

public class ObjectStream {

	public static void main(String[] args) {
		Member m1 = new Member("aaaa", 25);
		try {
			ObjectOutputStream oo = 
					new ObjectOutputStream(new FileOutputStream("src/day0816/files/e.datas"));
			oo.writeObject(m1);
			oo.close();
				
			ObjectInputStream oi = 
					new ObjectInputStream(new FileInputStream("src/day0816/files/e.datas"));
			Member m2 = (Member) oi.readObject(); //object타입이기때문에 다운캐스팅 필요
			oi.close();
			System.out.println(m2.name + " / " + m2.age);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
