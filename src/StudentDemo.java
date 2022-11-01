import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);

        String firstName;
        String lastName;
        double lunchBalance;

        System.out.println("Enter student first name:");
        firstName = in.nextLine();
        System.out.println("Enter student last name:");
        lastName = in.nextLine();
        System.out.println("Enter initial lunch balance:");
        lunchBalance = in.nextDouble();

        if(lunchBalance >= 0) {
            //Instantiate student
            Student student = new Student(firstName, lastName, lunchBalance);

            //Output student full name + id
            System.out.println("Student: " + student.getFullName());
            System.out.println("ID: " + student.getStudentId());
            System.out.println("Balance: $" + student.getLunchBalance());
        }
        else {
            System.out.println("Invalid initial deposit.");
        }

        //Closing connection to terminal
        in.close();
    }
}

