package 종합실습과제;

import java.util.Scanner;

public class 문제03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double f = ((double)c*1.8)+32;
		System.out.printf("섭씨온도 (C) : %d\n",c);
		System.out.printf("화씨온도 (F) : %.2f도",f);
	}
}
