package helloworld;

public class CW6 {

	public static void main(String[] args) {
		int arr[]= {20, 15, 30, 0, 25};
		int total=0;
		int out=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("Out of stock");
				out=1;
				break;
			}
			
			
				
				total=total+arr[i];
			}
		if(out==0) {
			if(total<50) {
				System.out.println(total+":Low Stock");
				
			}else if(total<100) {
				System.out.println(total+":Moderate Stock");
				
			}else if(total>=100) {
				System.out.println(total+":Good Stock");
				
			}
			
		}
				
				
			
		}

	}


