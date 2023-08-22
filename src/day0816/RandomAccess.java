package day0816;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile("src/day0816/files/f.txt","r");
			int ch;
			raf.seek(10); // 읽을 위치를 10으로 지정
			ch = raf.read();
			System.out.println((char)ch);
			raf.seek(5); // 읽을 위치를 5로 지정
			ch = raf.read();
			System.out.println((char)ch);
			raf.seek(20);
			ch = raf.read();
			System.out.println((char)ch);
			raf.seek(1);
			ch = raf.read();
			System.out.println((char)ch);
			
			
			
			for(int i = (int) raf.length(); i >= 0; i--) {
				raf.seek(i);
				ch = raf.read();
				System.out.print((char)ch+" ");
			}
			
			raf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
