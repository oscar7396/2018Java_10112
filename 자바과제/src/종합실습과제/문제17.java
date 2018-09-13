package 종합실습과제;

import java.util.Scanner;

public class 문제17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=b;i>=a;i--) {
			System.out.printf("%d ",i);
		}
	}
}
