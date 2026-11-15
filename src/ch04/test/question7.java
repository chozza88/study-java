package ch04.test;

import java.util.Scanner;

public class question7 {
	public static void main(String[] args) {
		/*
		 * while 문과 Scanner의 nextLine() 메소드를 이용해서 다음 실행 결과와
		 * 같이 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		String select = "";
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			select = scanner.nextLine();
			
			if(select.equals("1")) {
				System.out.print("예금액> ");
				String input = scanner.nextLine();
				int deposit = Integer.parseInt(input);
				balance += deposit;
			}
			
			if(select.equals("2")) {
				System.out.print("출금액> ");
				String input = scanner.nextLine();
				int withdrawal = Integer.parseInt(input);
				balance -= withdrawal;
			}
			
			if(select.equals("3")) {
				System.out.println("잔고> " + balance);
				
			}
			
			if(select.equals("4")){
				break;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
}
