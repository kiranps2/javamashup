package helloworld;

public class CW5 {

	public static void main(String[] args) {
		int mark[]= {90,78,60,52,40};
		for(int i=0;i<mark.length;i++) {
			if(mark[i]>=90) {
				System.out.println(mark[i]+":Excellent");
			}else if(mark[i]>=75&&mark[i]<=89) {
				System.out.println(mark[i]+":Good");

			}else if(mark[i]>=50&&mark[i]<=74) {
				System.out.println(mark[i]+":Average");

			}else if(mark[i]<=50) {
				System.out.println(mark[i]+":fail");

			}
		}

	}

}
