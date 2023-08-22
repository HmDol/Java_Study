package day01;

import java.util.Scanner;

public class Arr01 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = new int[5];
//		for(int i = 0 ; i< a.length; i++) {
//			a[i] = i;
//		}
//		for(int i = 0 ; i< a.length; i++) {
//			System.out.println(a[i]);
//		}
//		
//		float[] b = new float[2];
//		b[0] = 4.234f;
//		b[1] = 23.445f;
//		
//		for(int i = 0 ; i< b.length; i++) {
//			System.out.println(b[i]);
//		}
//		
//		String[] c = {"안녕", "하세요", "ㅋㅋㅋ"};
//		
//		for(int i = 0 ; i< c.length; i++) {
//			System.out.println(c[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
// 
		int[] temp = {5,7,3, 1, 9,2, 6,4};
		
		
		int sum = 0 ; 
		int min = 10;
		int max = 0;
		
//		// 직접입력
//		for(int i =0 ; i < temp.length; i++) {
//			System.out.print("num: ");
//			temp[i] = sc.nextInt();
//		}
		System.out.println("배열 삽입완료!");
		
		//합 계산
		for(int i = 0; i< temp.length; i++) {
			sum += temp[i];
		}
		
		//최대값 계산
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] > max) 	max = temp[i];
		}
		
		//최소값 계산
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] < min) 	min = temp[i];
		}
		
		System.out.println("요소들의 합 : " + sum);
		System.out.println("요소들의 최대 : " + max);
		System.out.println("요소들의 최소 : " + min);
		
//		System.out.print("검색할 정수를 입력 : ");
//		int search = sc.nextInt();
//		
//		int i;
//		for(i=0; i<temp.length; i++) {
//			if(temp[i] == search) { // ==연산자로 비교하면 참조값만 비교 so, 객체 내용 비교는 equels() 사용
//				System.out.println("찾으시는 정수는 " + i+1 +"번에 있습니다.");
//				break;
//			}
//		}
//		if(i == temp.length) System.out.println("찾으시는 정수는 없습니다.");
//		
		
		
		
		String[] St_list = {"aaa", "bbb", "ccc", "ddd"};
		
		System.out.print("검색할 문자열를 입력 : ");
		String st_search = sc.nextLine();
		
		int j;
		for(j=0; j<St_list.length; j++) {
			if(st_search.equals(St_list[j])) { // ==연산자로 비교하면 참조값만 비교 so, 객체 내용 비교는 equels() 사용
				System.out.println("있습니다.");
				break;
			}
		}
		if(j == St_list.length) System.out.println("없습니다.");
		
		
	}

}
