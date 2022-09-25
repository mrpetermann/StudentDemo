public class StudentDemo {
    public static void main(String[] a) {
        //Instantiate student A
        Student studentA = new Student(100, "12345");
        studentA.setLunchBalance(125);

        //Instantiate student B
        Student studentB = new Student(100, "10001");
        studentB.setStudentId("10007");

        //Output student A information
        System.out.println("Student A:");
        System.out.println("ID: " + studentA.getStudentId());
        System.out.println("Balance: $" + studentA.getLunchBalance());

        //Output student B information
        System.out.println("Student B:");
        System.out.println("ID: " + studentB.getStudentId());
        System.out.println("Balance: $" + studentB.getLunchBalance());
    }
}

