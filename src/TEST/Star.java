package TEST;
import java.util.*;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}
