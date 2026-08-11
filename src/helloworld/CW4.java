package helloworld;

import java.util.Scanner;

public class CW4 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			String username="admin";
			String psw="java123";
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the user name:");
			String name=input.nextLine();
			System.out.println("Enter the password:");
			String pass=input.nextLine();
			if (name.equals(username) && pass.equals(psw)) {
				System.out.println("Login successful!!");
			}else {
				System.out.println("Access Denied!!");

			}
			

		}
	

}
