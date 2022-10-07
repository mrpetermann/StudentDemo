public class Student {
    //Constants
    private static final int STUDENT_ID_DIGITS = 7;

    //Class properties
    private final int studentId;
    private String firstName;
    private String lastName;
    private double lunchBalance;

    /**
     * Create a new student
     * @param firstName first name of student
     * @param lastName last name of student
     */
    public Student(String firstName, String lastName) {
        this.studentId = getRandomStudentId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = 0;
    }

    /**
     * Create a new student
     * @param firstName first name of student
     * @param lastName last name of student
     * @param lunchBalance lunch balance of student
     */
    public Student(String firstName, String lastName, double lunchBalance) {
        this.studentId = getRandomStudentId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = lunchBalance;
    }

    /**
     * Get a random student id in range [0, max-1] where max is determined by constant
     * @return Random id as int
     */
    private static int getRandomStudentId() {
        return (int)Math.floor(Math.random() * Math.pow(10, STUDENT_ID_DIGITS));
    }

    //Name
    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Concatenate first name, " ", last name
     * @return String containing student full name
     */
    public String getFullName() {
        return this.firstName.concat(" ").concat(this.lastName);
    }

    //Lunch balance
    public double getLunchBalance(){
        return this.lunchBalance;
    }
    public void setLunchBalance(double lunchBalance) { this.lunchBalance = lunchBalance; }

    //Id
    public int getStudentId(){ return this.studentId; }
}