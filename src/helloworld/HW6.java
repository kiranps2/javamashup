package helloworld;

public class HW6 {

	public static void main(String[] args) {
		int arr[]= {100, 100, 98, 100, 99};
		int total=0;
		int avg=0;
		int out=0;
		for(int i:arr) {
			if(i<35) {
				System.out.println("Fail");
				out=1;
				break;
			}
			
			
				
				total=total+i;
				avg=total/arr.length;
			}
		if(out==0) {
			if(avg>90) {
				System.out.println("Grade: A:"+avg);
				System.out.println("total:"+total);

				
			}else if(avg>75) {
				System.out.println(avg+"Grade: B"+avg);
				System.out.println("total:"+total);

				
			}else if(avg>60) {
				System.out.println("Grade: C:"+avg);
				System.out.println("total:"+total);

				
			}else if(avg<60) {
				System.out.println("Grade: D:"+avg);
				System.out.println("total:"+total);

			}
			
		}
				
				
			
		}

	}


