package inheritance;

public class EducationPlatform_User {
	public static void main(String[] args) {
        OnlineCourse o = new OnlineCourse();
        o.login();
        o.watchVideo();
        o.takeExam();

        ClassroomCourse c = new ClassroomCourse();
        c.login();
        c.attendLecture();
        c.takeExam();
    }

}
