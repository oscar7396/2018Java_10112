package 종합실습과제;

import java.util.Scanner;

public class 문제11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		sc.nextLine();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		System.out.printf("판정: %s", Math.pow((x1-x2),1)+Math.pow(y1-y2, 1)<=Math.pow(r1+r2, 1)?"겹침":"안겹침");
	}
}
