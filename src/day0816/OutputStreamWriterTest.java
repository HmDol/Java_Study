package day0816;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가나다라마바사아자차카타파하";
		
		
		try {
			FileOutputStream fo = new FileOutputStream("src/day0816/files/test3.txt");
			OutputStreamWriter ow = new OutputStreamWriter(fo);
			ow.write(str);
			ow.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
