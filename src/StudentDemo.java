import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] a) {
        launch(new ConsoleStudentHandler());
    }

    private static void launch(IStudentHandler handler) {
        ArrayList<Student> studentArrayList = handler.getStudentList();
        handler.outputStudent(studentArrayList);
    }
}