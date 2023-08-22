package day0816;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//입력스트림
			FileInputStream fi = new FileInputStream("src/day0816/files/test.txt");
			BufferedInputStream bi = new BufferedInputStream(fi);
			
			//출력스트림
			FileOutputStream fo = new FileOutputStream("src/day0816/files/test2.txt");
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			
			int ch;
			while((ch=bi.read())!= -1) {
				bo.write(ch);
			} 
			bi.close();
			bo.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
