package day0810.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		byte[] buf = new byte[10];
		int size;
		try {
			FileInputStream fi = new FileInputStream("src\\day0810\\io\\file\\hell.txt");
			int cnt =0;
			 do{				
				 
				size = fi.read(buf);//buf 크기만큼(10)씩 읽어서 buf에 저장하고 읽은 바이트 수를 반환
				System.out.println("\nsize : " + size);
				System.out.print(new String(buf));//new String(buf): 바이트값을 문자열로 변환
				if (size != buf.length) {//더이상 읽을값 없음
					break;
				}
			 }while(true);
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

//// rldlo wo