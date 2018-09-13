package 종합실습과제;

import java.util.Scanner;

public class 문제12 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("두 과목 점수 : %d, %d\n",a,b);
		int t = a+b;
		double p = t/2;
		if(t>=60&&(a>=40&&b>=40))
			System.out.println("결과 : 합격");
		else 
			System.out.println("결과 : 불합격");
		
		
	}
}
