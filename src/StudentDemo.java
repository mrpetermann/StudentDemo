import java.util.Scanner;

public class StudentDemo {
    private static final int STUDENT_COUNT = 1300;

    public static void main(String[] a) {
        Student[] students = new Student[STUDENT_COUNT];

        //loop while more students to add
        students[0] = new Student("Ray", "S..."); //replace with getStudent()
        students[1] = new Student("Connor", "Boyle", 1);
        students[2] = new Student("Phil", "Swift", 3539);

        for(int i=0; i < students.length; i++) {
            if(students[i] != null)
                System.out.println(students[i].getFullName() + " has $" + students[i].getLunchBalance());
        }
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
    }
}

