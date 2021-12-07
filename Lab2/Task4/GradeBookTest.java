package Task4;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gradeBook1 = new GradeBook("CS101 Introduction to java programming", "sam smith");
        gradeBook1.displayName();
        System.out.println("\nchanging instructor name to judy jones\n");
        gradeBook1.setInstructorName("judy jones");
        gradeBook1.displayName();
    }
}
