package 제03차시;

public class 실습01 {

	public static void main(String[] args) {
		byte a1 = -128, a2 = 127, a3 = 037, a4 = 0x1f, a5 = 0b11111; // a3=8진수 37, a4=16진수 1f, a5=2진수 11111
		short b1 = -32768, b2 = 32767;
		int c1 = -2147483648, c2 = 2147483647;
		long d1 = 2147483648L, d2 = 1L << 63, d3 = (1L << 63) - 1; // d1에 L을 넣지 않을 경우 int범위를 넘어섰기 때문에 오류 발생, d2=최댓값,
																	// d3=최솟값

		float e = 3.14f; // java의 실수 기본형은 double이기 때문에 f를 넣지 않을 경우 3.14는 float의 최대값을 넘어선 값이므로 오류 발생
		double f1 = 3.14, f2 = 3.14d;

		char g1 = '통';
		char[] h1 = { '통', '신', '과' }, h2 = "통신과".toCharArray(); // 자료형 오른쪽, 변수명 오른쪽 모두 대괄호 사용 가능
		char h3[] = { '통', '신', '과' }, h4[] = "통신과".toCharArray(); // 문자열(String)은 toCharArray를 사용해 char로 변환시켜야 함

		boolean i = true;

		System.out.println(a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5);
		System.out.printf("%d, %d\n", b1, b2);
		System.out.printf("%d, %d\n", c1, c2);
		System.out.printf("%d,%d,%d\n", d1, d2, d3);
		System.out.printf("%.1f,%.1f,%.1f\n", e, f1, f2);
		System.out.print(g1 + "," + String.valueOf(h1) + "," + String.valueOf(h2) + "," + String.valueOf(h3) + ","
				+ String.valueOf(h4)); //String.valueOf() : char를 String으로 변환
		System.out.println();
		System.out.println(i);
	}

}
