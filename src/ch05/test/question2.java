package ch05.test;

public class question2 {
	public static void main(String[] args) {
		// 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해 보세요
		// (중첩 for 문 이용)
		int[][] array = {
				{95, 86}
				, {83, 92, 96}
				, {78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int totalLength = 0;
		for(int i = 0; i < array.length; i++) {
			totalLength += array[i].length;
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		double avg = (double) sum / totalLength;
		
		System.out.println("합 : " + sum + ", 평균 : " + avg);
	}
}
