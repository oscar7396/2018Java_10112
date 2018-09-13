package 종합실습과제;

import java.util.Scanner;

public class 문제02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		int d = a%b;
		
		System.out.println("두 정수 : "+ a + " " + b );
		System.out.println("몫 : " + c);
		System.out.println("나머지 : "+ d);
		
	}
}
