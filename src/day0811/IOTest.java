package day0811;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파일명 입력 : ");
		String fileNm ="", val ="";
		fileNm = sc.next();
		sc.nextLine();// 버퍼지우는 용도
		try {
			FileWriter fw = new FileWriter("src/day0811/files/"+fileNm);
			System.out.println("저장할 내용을 입력하세요");
			while(true) {
				val = sc.nextLine();
				if(val.equals("stop")) break;
				fw.write(val);
				fw.write("\n");
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
