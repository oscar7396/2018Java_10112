package 종합실습과제;

import java.util.Scanner;

public class 문제14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d월의 마지막 날은 31일 입니다.",n);
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.printf("%d월의 마지막 날은 30일 입니다.",n);
			break;
			
		default:
			System.out.printf("%d월의 마지막 날은 28일 입니다.",n);
			
		}
		
		
	}
}
