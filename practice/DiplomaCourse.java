package practice;

public class DiplomaCourse extends Course {

	DiplomaCourse(String courseName, int duration) {
		super(courseName, duration);
	
	}

	@Override
	double fees() {
		return 50000;
	}

}
