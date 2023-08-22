package day0816;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src/day0816/files/test.txt");
		if(f.exists()) {
			System.out.println("파일 존재함");
		}else {
			System.out.println("파일 존재 x");
		}
		
		if(f.isFile()){
			System.out.println("파일임");
		}
		System.out.println(f.length());
		System.out.println("파일 경로 " +f.getAbsolutePath());
		System.out.println("숨긴 파일 " +f.isHidden());
		System.out.println("읽기 기능 " +f.canRead());
		System.out.println("쓰기기능 " +f.canWrite());
		System.out.println("실행기능 " +f.canExecute());
		
		System.out.println("---------------------------------");
		File dir = new File("src/day0816/files/memo2");
		if(dir.exists()) {
			System.out.println("디렉 존재함");
		}else {
			System.out.println("디렉 존재 x");
			dir.mkdir();
		}
		System.out.println("디렉이야 ? " + dir.isDirectory());
		
		
		System.out.println("-------------------------------");
		File f2 = new File("src/day0816/files/a.txt");
		System.out.println("파일 존재: " + f2.exists());
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("생성 후 파일 존재: " + f2.exists());
		f2.delete();
		
		String path = "src/day0816/files/memo/";
		String[] fname = {"b.txt","c.txt", "d.txt"};
		for(String fn : fname) {
			File x = new File(path+fn);
			try {
				boolean b = x.createNewFile();
				System.out.println(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		File dir2 = new File(path);
		String[] list = dir2.list();
		System.out.println("memo 디렉 목록");
		for(String fn : list) {
			System.out.print(fn + ", ");
		}
	}

}
