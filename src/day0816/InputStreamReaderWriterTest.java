package day0816;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		InputStreamReader ir = 
				new InputStreamReader(new BufferedInputStream(System.in));
		
		try {
			while((ch=ir.read()) != '\n') {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
