import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleStudentHandler implements IStudentHandler{
    @Override
    public ArrayList<Student> getStudentList() {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();

        String response;
        do {
            studentArrayList.add(getStudent());

            System.out.println("Add another student? y/n");
            response = in.nextLine();
        } while(response.startsWith("y"));

        return studentArrayList;
    }

    @Override
    public void outputStudent(ArrayList<Student> studentList) {
        for (Student student : studentList)
            printStudent(student);
    }

    /**
     * Create a new student with console input
     * @return Student from user input
     */
    private static Student getStudent() {
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        double lunchBalance;

        //Get values from user for studentA
        System.out.println("Enter student first name:");
        firstName = in.nextLine();
        System.out.println("Enter student last name:");
        lastName = in.nextLine();

        //Get valid lunch balance
        do {
            System.out.println("Enter initial lunch balance:");
            lunchBalance = Double.parseDouble(in.nextLine());
        } while(lunchBalance < 0);

        return new Student(firstName, lastName, lunchBalance);
    }

    /**
     * Print student data
     * @param student Student object that contains data to print
     */
    private static void printStudent(Student student) {
        System.out.println("Student: " + student.getFullName());
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Balance: $" + student.getLunchBalance());
        System.out.println();
    }
}
