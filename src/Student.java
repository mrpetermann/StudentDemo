public class Student {
    private String firstName;
    private String lastName;
    private double lunchBalance;
    private int studentId;

    //accept name, random id
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = 0; //Default lunch balance
        this.studentId = (int)Math.floor(Math.random() * 100000);
    }

    //accept name, lunch bal, random id
    public Student(String firstName, String lastName, double lunchBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lunchBalance = lunchBalance;
        this.studentId = (int)Math.floor(Math.random() * 100000);
    }

    //name, get full name
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFullName() {
        return this.firstName.concat(" ").concat(this.lastName);
    }

    //lunch balance
    public double getLunchBalance(){ return this.lunchBalance; }
    public void setLunchBalance(double lunchBalance) { this.lunchBalance = lunchBalance; }

    //student id
    public int getStudentId(){ return this.studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
}

