import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] a) {
        //Create students
        Student studentA = getStudent();
        Student studentB = getStudent();

        //Print students
        printStudent(studentA);
        printStudent(studentB);

        //Test whether two students are the same
        System.out.println("Students are same: " + studentA.equals(studentB));
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

        in.close();

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
    }
}

