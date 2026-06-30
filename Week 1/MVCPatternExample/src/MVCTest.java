public class MVCTest {

    public static void main(String[] args) {

        // Model
        Student student = new Student(
                "Rahul",
                101,
                "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Details");

        controller.updateView();

        System.out.println();
        System.out.println("After Updating");

        controller.setStudentName("Amit");

        controller.setStudentGrade("A+");

        controller.updateView();

    }

}