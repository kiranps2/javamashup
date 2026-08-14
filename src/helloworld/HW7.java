package helloworld;
import java.util.Scanner;
import java.time.LocalDateTime; // import the LocalDateTime class

public class HW7 {
	public static double Calc(int[] quantity, int[] price) {
		double total=0;
		for(int i=0;i<quantity.length;i++) {
			total += quantity[i] * price[i];
		}
		if(total>500) {
			System.out.println("10% discount");
			total = total - (total * 0.10);
		}
        System.out.println("Final Amount = Rs." +total);

		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item[]={"Rice", "Sugar", "Oil", "Soap", "Milk"};
		int price[]= {50, 40, 100, 25, 30};
		int[] quantity=new int[5];
		for(int i=0;i<item.length;i++){  
			System.out.println(item[i]+"-"+price[i]);
	    }
		System.out.println("Enter the quantity:");
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<quantity.length;i++) {
			try {
				
				System.out.println(item[i]+" quantity: ");
				quantity[i] = input.nextInt();
			}catch(ArithmeticException e){
		         System.out.println("Number should not be divided by zero");
		      } 
		}
		 LocalDateTime currDateTime = LocalDateTime.now();
		    System.out.println("current date and time of the purchase:"+currDateTime);
		Calc(quantity, price);
		
	}

}
