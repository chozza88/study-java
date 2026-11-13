package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		// 문자열과의 + 연산은 문자열 연결을 나타낸다.
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (60 * hour) + minute;
		System.out.println("총 " + totalMinute + "분");
	}
}
