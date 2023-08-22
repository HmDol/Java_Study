package day0810.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream fi = new FileInputStream("src\\day0810\\io\\file\\hell.txt");
			int ch =0;
			while((ch = fi.read()) != -1) {
				System.out.print((char)ch);
			}
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
