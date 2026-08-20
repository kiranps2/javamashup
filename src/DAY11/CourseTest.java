package DAY11;

public class CourseTest {

	public static void main(String[] args) {
		Coursetwo coursetwo1=new Coursetwo("java",4,5);
		Coursetwo coursetwo2=new Coursetwo("python",6,8);
		Coursetwo.Platform nested=new Coursetwo.Platform();
		nested.print();

	}

}
