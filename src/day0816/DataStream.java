package day0816;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo = new FileOutputStream("src/day0816/files/test4.txt");
			DataOutputStream df = new DataOutputStream(fo);
			df.writeByte(1);
			df.writeChar('a');
			df.writeDouble(12.3455);
			df.writeInt(14);
			df.writeUTF("hello");
			df.close();
			
			FileInputStream fi = new FileInputStream("src/day0816/files/test4.txt");
			DataInputStream di = new DataInputStream(fi);
			
			System.out.println(di.readByte());
			System.out.println(di.readChar());
			System.out.println(di.readDouble());
			System.out.println(di.readInt());
			System.out.println(di.readUTF());
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
