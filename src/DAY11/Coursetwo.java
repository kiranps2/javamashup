package DAY11;

public class Coursetwo {
	String course_name;
	int duration ;
	 int numstudents;
	 static int count_student=0;
	final  String creator_name="CodeMentor Academy";
	Coursetwo(String course_name,int duration ,int numstudents){
		this.course_name=course_name;
		this.duration=duration;
		this.numstudents=numstudents;
		count_student++;
		System.out.println("course name: "+course_name+" duration: "+duration+"no:of students: "+numstudents);
		System.out.println("number of students enrolled: "+count_student);
	}
	static class Platform {
		void print() {
			System.out.println("Courses are hosted on CodeMentor.");
		}
	}

}
