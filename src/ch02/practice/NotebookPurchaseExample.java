package ch02.practice;

public class NotebookPurchaseExample {
	
	// 문제: 공책 한 권은 1,500원이에요. 4권을 사고 10,000원을 냈을 때 총 구매 금액과 거스름돈을 출력하세요.
	// 가격, 수량, 낸 돈을 각각 변수에 저장하세요.
	// 총 구매 금액과 거스름돈을 계산해서 변수에 저장하세요. 
	// 출력할 때는 계산한 변수를 사용하세요.
	public static void main(String[] args) {
		int bookPrice = 1500;				// 공책 한권 가격
		int quantity = 4;						// 수량
		int money = 10000;					// 현금
								
		int totalPrice = bookPrice * quantity;	// 구매가격
		int change = money - totalPrice;		// 거스름돈 가격
		
		System.out.println("책 한권의 가격은 " + bookPrice + "이며, 수량은 " + quantity + "개이므로 구매 가격은 " + totalPrice + "이다.");
		System.out.println("대신 나는 현금을 " + money + "을 냈다. 거스름 돈으로 " + change + "원이 남았다.");
	}
}
