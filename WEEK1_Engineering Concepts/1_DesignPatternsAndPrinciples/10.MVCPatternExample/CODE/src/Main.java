public class Main {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("John Doe", "S101", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display Initial Info
        controller.updateView();

        System.out.println("\nUpdating student record...\n");

        // Update student info via controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Display updated info
        controller.updateView();
    }
}

