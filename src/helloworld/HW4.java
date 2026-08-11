package helloworld;
import java.util.Scanner;
public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the user name:");
		String urname=input.nextLine();
		System.out.println("enter the password:");
		int psw=input.nextInt();
		System.out.println("enter the role id:");
		int role=input.nextInt();
		if(urname.equals("A")&&psw==1234&&role==1) {
			System.out.println("Welcome Admin. Full access granted.");
		}else if(urname.equals("S")&&psw==1111&&role==2) {
			System.out.println("Welcome Student. Limited access granted.");
		}else if(role==3) {
			System.out.println("Welcome Guest. View-only access.");
		}else {
			System.out.println("Invalid credentials or role.");
		}
	}

}
