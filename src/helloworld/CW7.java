package helloworld;
import java.time.LocalDateTime;
import java.util.Scanner;
public class CW7 {
	public static double Avge(double[] mark) {
		double sum=0;
		double avg=0;
		for(int i=0;i<mark.length;i++) {
			sum+=mark[i];
			avg=sum/mark.length;
		}
		System.out.println("average mark: "+avg);
		return avg;
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the nuymmber of students: ");
		int no=input.nextInt();
		input.nextLine();
		String[] name=new String[no];
		double[] mark=new double[no];
		System.out.println("enter the names of students: ");
		for(int i=0;i<no;i++) {
			name[i]=input.nextLine();
		}
		System.out.println("enter the marks of students: ");
		for(int i=0;i<no;i++) {
			mark[i]=input.nextDouble();
		}
		System.out.println("list of students and marks:");
		for(int i=0;i<no;i++) {
			if(mark[i]<35) {
				System.out.println("name: "+name[i]+" mark: "+mark[i]+" Needs Improvement");
			}else {
				System.out.println("name: "+name[i]+" mark: "+mark[i]);
			}
		}
		LocalDateTime currDateTime = LocalDateTime.now();
	    System.out.println("current date and time of the purchase:"+currDateTime);
		Avge(mark);
	}

}
