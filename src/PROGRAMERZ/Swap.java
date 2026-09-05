package PROGRAMERZ;
import java.util.*;
public class Swap {
	public static void main(String[] args) {
		int a;
		int b;
		int temp;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter first number: ");
		 a=input.nextInt();
		 System.out.println("enter second number: ");
		 b=input.nextInt();
		 temp=a;
			a=b;
			b=temp;
			System.out.println("after swap:");
			System.out.println("a: "+a);
			System.out.println("b: "+b);
	}
}
