package ch03.sec05;

/*
 *	실수 연산 결과가 Infinity 또는 NaN인지 검사하는 예제.
 *	추후 해당 조건에서 예외를 발생시키는 코드로 확장할 수 있음.
 */
public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		
		// 잘못된 코드
		System.out.println(z + 2);
		
		// 알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z + 2);
		}
	}
}
