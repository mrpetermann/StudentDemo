import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] a) {
        //Creating a scanner to read user input from console
        Scanner in = new Scanner(System.in);

        String firstName;
        String lastName;
        double lunchBalance;

        //Get values from user for studentA
        System.out.println("Enter student first name:");
        firstName = in.nextLine();
        System.out.println("Enter student last name:");
        lastName = in.nextLine();
        System.out.println("Enter initial lunch balance:");
        lunchBalance = Double.parseDouble(in.nextLine());

        Student studentA = null;
        if(lunchBalance >= 0) {
            //Instantiate student
            studentA = new Student(firstName, lastName, lunchBalance);

            //Output student full name + id
            System.out.println("Student: " + studentA.getFullName());
            System.out.println("ID: " + studentA.getStudentId());
            System.out.println("Balance: $" + studentA.getLunchBalance());
        }
        else {
            System.out.println("Invalid initial deposit.");
        }

        //Get values from user for studentB
        System.out.println("Enter student first name:");
        firstName = in.nextLine();
        System.out.println("Enter student last name:");
        lastName = in.nextLine();
        System.out.println("Enter initial lunch balance:");
        lunchBalance = Double.parseDouble(in.nextLine());

        Student studentB = null;
        if(lunchBalance >= 0) {
            //Instantiate student
            studentB = new Student(firstName, lastName, lunchBalance);

            //Output student full name + id
            System.out.println("Student: " + studentB.getFullName());
            System.out.println("ID: " + studentB.getStudentId());
            System.out.println("Balance: $" + studentB.getLunchBalance());
        }
        else {
            System.out.println("Invalid initial deposit.");
        }

        //If students exist, test whether they are the same
        if(studentA != null && studentB != null)
            System.out.println("Students are same: " + studentA.equals(studentB));

        //Close connection to terminal
        in.close();
    }
}

