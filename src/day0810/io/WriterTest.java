package day0810.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//파일에 문자 단위로 출력 스트림
			FileWriter fw = new FileWriter("src/day0810/io/file/OutFile.txt");
			String str = "문자 출력 스트림: 문자 단위(2바이트씩)로 출력 스트림.";
			fw.write(str);//출력
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}