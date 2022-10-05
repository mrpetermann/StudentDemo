public class Student {
    //Constants
    private static final int STUDENT_ID_DIGITS = 7;

    //Class properties
    private String firstName;
    private String lastName;
    private double lunchBalance;
    private int studentId;

    /*
    Constructor
    Input: first and last name
    Process: default lunch balance, random student id [0, MAX]
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = 0;
        this.studentId = getRandomStudentId();
    }

    /*
    Constructor
    Input: first and last name, lunch balance
    Process: random student id [0, MAX]
     */
    public Student(String firstName, String lastName, double lunchBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = lunchBalance;
        this.studentId = getRandomStudentId();
    }

    /*
    Function: Gets a random student id
    Process: generate random number, multiply by max value, round down, parse int
    Input: none
    Output: random integer
     */
    private static int getRandomStudentId() {
        return (int)Math.floor(Math.random() * Math.pow(10, STUDENT_ID_DIGITS));
    }

    //Name
    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFullName() {
        return this.firstName.concat(" ").concat(this.lastName);
    }

    //Lunch balance
    public double getLunchBalance(){ return this.lunchBalance; }
    public void setLunchBalance(double lunchBalance) { this.lunchBalance = lunchBalance; }

    //Id
    public int getStudentId(){ return this.studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
}