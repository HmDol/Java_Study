package hw01;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//과제1 소수 갯수 찾기
		System.out.println("과제 1");
		int temp; // 소수 식별 변수
		int count = 0;
		for(int i = 2; i < 101 ; i++ ) {
			temp = 0;
			if( i % 2 == 0) continue;
			else {
				for(int j = i-1; j > 1 ; j-- ) {
					if(i%j == 0) {temp = 1; break;}
				}
				if (temp == 0) {
//					System.out.println(i);
					count += 1;
				}
			}
		}
		System.out.println("소수의 개수 : "  + count + "\n");
		
		
		//과제2 왼쪽 삼각형
		System.out.println("과제 2");
		System.out.print("삼각형의 크기 : ");
		int size = sc.nextInt();
		for(int i = 1; i <=size; i++) {
			for(int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		//과제3 오른쪽 삼각형
		System.out.println("과제 3");
		System.out.print("삼각형의 크기 : ");
		size = sc.nextInt();		
		for(int i=1; i<=size; i++) {
			for(int j = 1; j <= size-i; j++) {
				System.out.print(" ");
			}
			for(int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("\n\n");
		
		//과제4 중간 삼각형
		System.out.println("과제 4");
		System.out.print("삼각형의 크기(홀수면 깔끔) : ");
		size = sc.nextInt();		
		for(int i=1; i <= size; i+=2) {
			int temp2 = (size - i)/2;
			for(int j = 0; j < temp2; j++) 
				System.out.print(" ");
			for(int j = 0; j < i; j++)
				System.out.print("*");
			for(int j = 0; j < temp2; j++) 
				System.out.print(" ");
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		//과제5 마름모
		System.out.println("과제 5");
		System.out.print("삼각형의 크기(홀수면 깔끔) : ");
		size = sc.nextInt();		
		for(int i=1; i <= size; i+=2) {
			int temp2 = (size - i)/2;
			for(int j = 0; j < temp2; j++) 
				System.out.print(" ");
			for(int j = 0; j < i; j++)
				System.out.print("*");
			for(int j = 0; j < temp2; j++) 
				System.out.print(" ");
			System.out.println();
		}
		for(int i=size-2; i>0;i-=2) {
			int temp2 = (size-i)/2;
			for(int j = 0; j < temp2; j++) 
				System.out.print(" ");
			for(int j = 0; j < i; j++)
				System.out.print("*");
			for(int j = 0; j < temp2; j++) 
				System.out.print(" ");
			System.out.println();
		}
	}
}
