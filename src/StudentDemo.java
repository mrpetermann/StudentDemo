import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();

        String response;
        do {
            studentArrayList.add(getStudent());

            System.out.println("Add another student? y/n");
            response = in.nextLine();
        } while(response.startsWith("y"));

        //Print student information
        for(int i=0; i < studentArrayList.size(); i++)
            printStudent(studentArrayList.get(i));
    }

    /**
     * Create a new student with console input
     * @return Student from user input
     */
    private static Student getStudent() {
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        double lunchBalance = 0;

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

