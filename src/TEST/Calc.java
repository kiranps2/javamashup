package TEST;
import java.util.*;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=input.nextInt();
		System.out.println("enter the second number");
		int b=input.nextInt();
		input.nextLine();
//		System.out.println("enter the operation");
//		String op=input.nextLine();
//		if(op.equals("+")) {
//			System.out.println(add(a,b));
//		}else if(op.equals("-")) {
//			System.out.println(sub(a,b));
//		}else if(op.equals("*")) {
//			System.out.println(sub(a,b));
//		}else if(op.equals("/")) {
//			System.out.println(div(a,b));
//		}
		Calc c=new Calc();
		System.out.println("add= "+c.add(a,b));
		System.out.println("sub= "+c.sub(a,b));
		System.out.println("mul= "+c.mul(a,b));
		System.out.println("div= "+c.div(a,b));

	}
	static int add(int a,int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int div(int a,int b) {
		return a/b;
	}
	
}
