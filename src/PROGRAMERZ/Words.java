package PROGRAMERZ;
import java.io.*;
import java.util.*;
public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("newFile.txt");
		String data = "Java is a popular programming language used to create applications and software. It is object-oriented, platform-independent, and easy to learn. Java is widely used for web applications, mobile apps, and enterprise software. good okey.";
		char[] array = new char[1000];
		
		try {
		       // Creates a Writer using FileWriter
		       FileWriter output = new FileWriter("newFile.txt");
		       
		       // Writes string to the file
		       output.write(data);
		       System.out.println("Data is written to the file.");

		       // Closes the writer
		       output.close();
		       FileReader input = new FileReader("newFile.txt");

		       // Reads characters
		       input.read(array);
		       System.out.println("Data in the file:");
		       System.out.println(array);

		       // Closes the reader
		       input.close();
		       Scanner co=new Scanner(file);
				int count=0;
				int sencount=0;
				
				while(co.hasNext()) {
					String word=co.next();
					count++;
					if(word.endsWith(".")) {
						sencount++;
					}
				}
				System.out.println("count of words: "+count);
				System.out.println("count of sentance: "+sencount);
				co.close();
		     }
		     catch (Exception e) {
		       e.getStackTrace();
		     }
		
	}

}
