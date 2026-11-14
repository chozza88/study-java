package ch02.practice;

public class PurchaseExample {
	public static void main(String[] args) {
		int price = 35000;
		int quantity = 3;
		double discount = 0.1;
		int noDiscount = price * quantity;
		double discountPrice = noDiscount * discount;
		double purchase = noDiscount * (1 - discount);
		
		System.out.println("할인 전 총액: " + noDiscount);
		System.out.println("할인 금액: " + (int)discountPrice);
		System.out.println("최종 결제 금액: " + (int)purchase);
		
	}
}
