package day0810.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] buf = new char[10];
		try {
			// 문자 단위 읽기 스트림 생성
			FileReader fr = new FileReader("src/day0810/io/file/hell.txt");
			int size = 0;
			while (true) {
				size = fr.read(buf);// read(buf): buf크기만큼씩 읽는다. 문자10개
				System.out.print(new String(buf));// char배열을 문자열로 변환
				if (size != buf.length) {
					break;
				}
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}