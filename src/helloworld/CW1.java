package helloworld;

public class CW1 {

	public static void main(String[] args) {
		int nobook=3;
		int price=275;
		double total=nobook*price;
		System.out.println("number of books:"+nobook);
		System.out.println("price of 1 book:"+price);
		
		System.out.println("total price:"+total);
		int discount=10;
		System.out.println("discount:"+discount);
		double disc=discount;
		double discamount=total*(disc/100);
		double finaltotal=total-discamount;
		System.out.println("final bill after 10% off:"+finaltotal);
				

	}

}
