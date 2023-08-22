package day0810.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] buf = new char[10];

			FileReader fr;
			try {
				fr = new FileReader("src\\day0810\\io\\file\\hell.txt");
				int size = 0;
				while(true) {
					size = fr.read(buf);
					System.out.print(new String(buf));
					if(size != buf.length) {
						break;
					}
				
				}
				fr.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}

}
