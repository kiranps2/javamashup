package DAY12;
import java.io.*;

public class CW {

	public static void main(String[] args) {
		File file=new File("assignment1.txt");
		char[] array = new char[100];
		String data="Java File Handling Practice";
		try {
			FileWriter output = new FileWriter("assignment1.txt");
			 output.write(data);
			 output.close();
			 if(file.exists()) {
					System.out.println("file created");
				}else {
					System.out.println("file already exist");
				}
		      FileReader input = new FileReader("assignment1.txt");
		      input.read(array);
		      input.close();
		      System.out.println("Data in the file:");
		      System.out.println(array);
		       System.out.println("Data is written to the file.");
		       file.delete();
		       if(file.exists()) {
					System.out.println("file created");
				}else {
					System.out.println("file deleteed");
				}
			
		}catch(Exception e){
			e.getStackTrace();
		}

	}

}
