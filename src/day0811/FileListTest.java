package day0811;

import java.io.File;

public class FileListTest {

	public static void main(String[] args) {
		// File : 파일에 대한 정보를 갖는 클래스, 파일의 경로, 크기, 오픈모드...
		// 디렉토리는 특수 파일
		
		File dir = new File("src/day0811/files");
		String[] files = dir.list();
		for(String s : files)System.out.println(files);

	}

}
 