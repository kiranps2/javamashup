package helloworld;
import profile.UserInput;
import greeting.GreetingDisplay;
public class MainProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInput user = new UserInput();
		String name = user.getName();
		GreetingDisplay greeting = new GreetingDisplay();
		greeting.displayGreeting(name);


	}

}
