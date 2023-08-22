package day0810.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("복사할 파일명 : ");
			String file = sc.next();
			FileReader fr = new FileReader("src/day0810/io/file/"+file);
			System.out.print("복사파일명 입력 : ");
			String file2 = sc.next();
			FileWriter fw = new FileWriter("src/day0810/io/file/"+file2);
			int ch = 0;
			System.out.print("-----------------------------\n복사한 내용\n->");
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
				//파일에 문자 단위로 출력 스트림
				fw.write(ch);
			}
//			fw.write(str);//출력
			fw.close();
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