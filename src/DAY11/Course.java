package DAY11;

public class Course {
	String course_name;
	int duration;
	final String training_center_name="mashup";
	static int course_count=0;
	Course(){
		String course_name="java";
		int duration=6;
		course_count++;
		System.out.println("course name: "+course_name+" duration: "+duration);
		System.out.println("default Constructor is called");
	}
	Course(String course_name,int duration){
		this.course_name=course_name;
		this.duration=duration;
		course_count++;
		System.out.println("course name: "+course_name+" duration: "+duration);
		System.out.println("course count:"+course_count);
	}
	class CourseMaterial{
		void printMaterial() {
	        System.out.println("Materials provided for this course.");
	    }
	}
	
	
}
