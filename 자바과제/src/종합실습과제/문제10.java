package 종합실습과제;

import java.util.Scanner;

public class 문제10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.printf("주민등록번호 : %s\n",a);
		if((char)(a.charAt(7))%2==0)
			System.out.println("성별 : 여자");
		else
			System.out.println("성별 : 남자");
		
	}
}
