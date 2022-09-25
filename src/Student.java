public class Student {
    private double lunchBalance;
    private String studentId;

    public Student(double lunchBalance, String studentId) {
        this.lunchBalance = lunchBalance;
        this.studentId = studentId;
    }

    public double getLunchBalance(){ return this.lunchBalance; }
    public void setLunchBalance(double lunchBalance) { this.lunchBalance = lunchBalance; }

    public String getStudentId(){ return this.studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
}

