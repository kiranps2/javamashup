package registraion;

import java.util.Scanner;

public class Inn {

    Scanner input = new Scanner(System.in);

    public String getName() {
        return input.nextLine();
    }

    public int getAge() {
        return input.nextInt();
    }
}