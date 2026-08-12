package helloworld;

public class HW5 {

	public static void main(String[] args) {
		int arr[][]= {
	            {100, 80, 70},
	            {120, 90, 60},
	            {110, 100, 80},
	            {90, 95, 70},
	            {100, 85, 75}
	        };
		for(int j=0;j<arr[0].length;j++) {
			int total=0;
			for(int i=0;i<arr.length;i++) {
				total+=arr[i][j];
			}
			if (total >= 500) {
                System.out.println(total+":Target Achieved");

            } else if (total >= 300) {
                System.out.println(total+":Average Performance");

            } else {
                System.out.println(total+":Needs Improvement");
            }

			System.out.println();
		}

	}

}
