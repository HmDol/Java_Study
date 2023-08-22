package day0810.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 바이트 단위로 파일에 출력 스트림
			// 출력 스트림의 타깃 파일은 없으면 자동 생성됨
			FileOutputStream fo = new FileOutputStream("src/day0810/io/file/hell.txt");
			byte[] str = "안녕하세요 ".getBytes(); // => {'h','e','l'....}
			for (byte b : str) {
				fo.write(b);
			}
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}