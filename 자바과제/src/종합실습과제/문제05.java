package 종합실습과제;

import java.util.Scanner;

public class 문제05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int h = s/3600;
		int m = s/60-h*60;
		int sec = s%60;
		
		System.out.printf("시간(초) : %d\n",s);
		System.out.printf("%02d시간 %02d분 %02d초",h,m,sec);
		
		//System.out.printf("%02d시간 %02d분 %02d초",s/3600,(s%3600)/60,s%60);
	}
}
