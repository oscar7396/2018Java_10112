package 종합실습과제;

public class 문제24 {
	public static void main(String[] args) {
		System.out.println("[ASCII 코드표]");
		for(char i=32;i<=127;i++) {
			System.out.printf("%d %c\t",(int)i,i);
			if((int)i%10==1)
				System.out.printf("\n");
		}
	}
}
