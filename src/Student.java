public class Student {
    //Class properties
    private String firstName;
    private String lastName;
    private double lunchBalance;
    private int studentId;

    /*
    Constructor
    Input: first and last name
    Process: default lunch balance, random student id [0, 99999]
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = 0;
        this.studentId = (int)Math.floor(Math.random() * 100000);
    }

    /*
    Constructor
    Input: first and last name, lunch balance
    Process: random student id [0, 99999]
     */
    public Student(String firstName, String lastName, double lunchBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = lunchBalance;
        this.studentId = (int)Math.floor(Math.random() * 100000);
    }

    //Name
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFullName() {
        return this.firstName.concat(" ").concat(this.lastName);
    }

    //Lunch balance
    public double getLunchBalance(){ return this.lunchBalance; }
    public void setLunchBalance(double lunchBalance) { this.lunchBalance = lunchBalance; }

    //ID
    public int getStudentId(){ return this.studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
}

