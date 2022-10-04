public class StudentDemo {
    public static void main(String[] a) {
        //Instantiate students A and B
        Student studentA = new Student("Brad", "Johnson");
        Student studentB = new Student("Ray", "Schmitt", 125);

        //Output student A full name + id
        System.out.println("Student A: " + studentA.getFullName());
        System.out.println("ID: " + studentA.getStudentId());
        System.out.println("Balance: $" + studentA.getLunchBalance());

        //Output student B full name + id
        System.out.println("Student B: " + studentB.getFullName());
        System.out.println("ID: " + studentB.getStudentId());
        System.out.println("Balance: $" + studentB.getLunchBalance());
    }
}

