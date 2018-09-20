package 제07차시_2;

public class Main {
	public static void main(String[] args) {
	Car myCar = new Car();
	
	//myCar 객체의 필드(속성, 멤버변수)들을 지정하세요.
	myCar.from = "독일 아우디";
	myCar.kind = "아우디";
	myCar.color = "검정";
	myCar.number = "7396";
	myCar.y = 10;
	myCar.b = 10;
	myCar.nowP = 2;
	myCar.who = "Lee Na Yoon";
	myCar.max = 500;
	myCar.nowS = 80;
	myCar.nowY = 9;
	
	
	//myCar 객체의 필드 값들을 모두 출력하세요.
	
	System.out.println("제조사: "+myCar.제조사);
	System.out.println("차종: "+myCar.차종);
	System.out.println("차량색상:"+myCar.차량색상);
	System.out.println("차량번호: "+myCar.차량번호);
	System.out.println("연비: "+myCar.연비);
	System.out.println("배기량: "+myCar.배기량);
	System.out.println("주행상태: "+myCar.주행상태);
	System.out.println("차량소유자: "+myCar.차량소유자);
	System.out.println("주행가능거리: "+myCar.주행가능거리);
	System.out.println("현재속도: "+myCar.현재속도);
	System.out.println("현재연비: "+myCar.현재연비);
	

	//myCar 객체의 메소드를 호출하여 동작시키세요.
	System.out.println("무슨 행동을 취할까요?");
	}

}
