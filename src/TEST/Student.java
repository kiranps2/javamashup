package TEST;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] id= {1,2,3};
		String[] name= {"rajesh","rahul","sruthi"};
		Scanner input=new Scanner(System.in);
		System.out.println("enter the id:");
		int idd=input.nextInt();
		try {
			System.out.print("name: "+name[idd-1]);
		}catch(ArrayIndexOutOfBoundsException e){
			if(idd>id.length) {
				System.out.println("no  student");
			}
		}
		
		
	}

}
