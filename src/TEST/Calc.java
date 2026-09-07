package TEST;
import java.util.*;
class Calculator{
	 float add(float a,float b) {
		return a+b;
	}
	 float sub(float a,float b) {
		return a-b;
	}
	 float mul(float a,float b) {
		return a*b;
	}
	 float div(float a,float b) {
		if(b==0) {
			System.out.println("invalid");
			return 0;
		}else {
			return a/b;
		}
		
	}
}
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		try (Scanner input = new Scanner(System.in)) {
		
		int  op;
		do {
			System.out.println("enter the choice");
			System.out.println("1.add");
			System.out.println("2.sub");
			System.out.println("3.mul");
			System.out.println("4.div");
			System.out.println("5.exit");
			 op=input.nextInt();
			 if(op<=4) {
			System.out.println("enter the first number");
			float a=input.nextFloat();
			System.out.println("enter the second number");
			float b=input.nextFloat();
			input.nextLine();
			
		
		
		
		switch(op) {
		case 1:System.out.println("add= "+c.add(a,b));
		break;
		case 2:System.out.println("sub= "+c.sub(a,b));
		break;
		case 3:System.out.println("mul= "+c.mul(a,b));
		break;
		case 4:System.out.println("div= "+c.div(a,b));
		break;
		
		}
			 }else if(op==5) {
				 System.out.println("exit");
				 break;
			 }
		
		
		
		}while(op!=5);
		
		}
	}
	
	
}
