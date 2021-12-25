package Lab2.Task4;

public class GradeBook {
    private String courseName;
    private String instructorName;

    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void displayName() {
        System.out.printf("welcome to the grade book for\n%s!\n", getCourseName());
        System.out.printf("followed by the instructor’s name: %s!\n", getInstructorName());

    }

}
