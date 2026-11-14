package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - (pieceUnit * number);	// 부동 소수점 방식에서 일어나는 실수타입
		System.out.println("사과 1개에서 남은 양" + result);
	}
}
