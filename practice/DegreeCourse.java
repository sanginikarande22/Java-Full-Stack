package practice;

public class DegreeCourse extends Course {

	DegreeCourse(String courseName, int duration) {
		super(courseName, duration);
		
	}

	@Override
	double fees() {
		return  45000;
		
	}

}
