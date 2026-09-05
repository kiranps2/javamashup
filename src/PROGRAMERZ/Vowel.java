package PROGRAMERZ;
import java.util.*;
public class Vowel {
	public static void main(String[] args) {
		String ch;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the letter: ");
		ch=input.nextLine();
		if(ch.equals("a")|ch.equals("e")|ch.equals("i")|ch.equals("o")|ch.equals("u") ) {
			System.out.println("its vowel");
		}else {
			System.out.println("not vowel");
		}
	}
}
