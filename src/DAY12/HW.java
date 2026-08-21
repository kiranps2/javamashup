package DAY12;
import java.io.*;
public class HW {

	public static void main(String[] args) {
		File file=new File("log.txt");
		char[] array = new char[100];
		String data="Book order placed at today morning";
		try {
			FileWriter output = new FileWriter("log.txt");
			output.write(data);
			output.close();
			if(file.exists()) {
				System.out.println("file exist!!!");
			}else {
				System.out.println("file not exist!!!");
			}
			FileReader input = new FileReader("log.txt");
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
