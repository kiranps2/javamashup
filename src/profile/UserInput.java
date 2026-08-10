package profile;

import java.util.Scanner;

public class UserInput{
	Scanner input=new Scanner(System.in);
	public String getName() {
		System.out.println("Enter the name:");
		return input.nextLine();
	}
}
