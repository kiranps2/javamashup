package helloworld;

public class CW6 {

	public static void main(String[] args) {
		int arr[]= {20, 15, 30, 10, 25};
		int total=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("Out of stock");
				break;
			}
			
			
				
				total=total+arr[i];
			}
				if(total<50) {
					System.out.println(total+":Low Stock");
					
				}else if(total<100) {
					System.out.println(total+":Moderate Stock");
					
				}else if(total>=100) {
					System.out.println(total+":Good Stock");
					
				}
				
			
		}

	}


