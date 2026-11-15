package ch04.test;

public class question4 {
	public static void main(String[] args) {
		/*
		 *	while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때
		 *	나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
		 *	눈의 합이 5이면 실행을 멈추는 코드를 작성해 보세요.
		 *	눈의 합이 5가 되는 경우는 (1,4), (4,1), (2,3), (3,2)입니다. 
		 */
		
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1; 
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("눈1: " + dice1 + ", 눈2: " + dice2 + ", 합: " + (dice1 + dice2));
			
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
