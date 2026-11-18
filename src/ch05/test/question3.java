package ch05.test;

import java.util.Scanner;

public class question3 {
	// 학생들의 점수를 분석하는 프로그램을 만들려고 합니다. 
	// 키보드로 부터 학생 수와 각 학생들의 점수를 입력받고, 
	// while 문과 Scanner의 nextLine() 메소드를 이용해서
	// 최고 점수 및 평균 점수를 출력하는 코드를 작성해 보세요.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scores = null;
		int studentCount = 0;
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택>");
			
			String programSelect = scanner.nextLine();
			
			if(programSelect.equals("1")) {
				System.out.print("학생수>");
				int inputCount = Integer.parseInt(scanner.nextLine());
				
				if(inputCount <= 0) {
					System.out.println("*** 학생 수는 1명 이상 입력하세요 ***");
					continue;
				}
				
				studentCount = inputCount;
				scores = null;
			}
			
			if(programSelect.equals("2")) {
				if(studentCount <= 0) {
					System.out.println("*** 학생 수를 먼저 입력하세요 ***");
					continue;
				}
				scores = new int[studentCount];
				
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}
			
			if(programSelect.equals("3")) {
				if (scores == null || scores.length == 0) {
                    System.out.println("*** 학생 수와 점수를 먼저 입력하세요 ***");
                    continue;
                }

                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
				
			}
			
			if(programSelect.equals("4")) {
				if (scores == null || scores.length == 0) {
                    System.out.println("*** 학생 수와 점수를 먼저 입력하세요 ***");
                    continue;
                }

                int sum = 0;
                int max = scores[0];

                for (int i = 1; i < scores.length; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                }

                for (int score : scores) {
                    sum += score;
                }

                double avg = (double) sum / scores.length;

                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
				
			}
			if(programSelect.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
		
}
