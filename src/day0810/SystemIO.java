package day0810;

import java.io.IOException;

public class SystemIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch = 0;
		try {
			while((ch = System.in.read()) != '\n') {
				System.out.print(ch + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
