package springframework.steriotype;


public class Student2 {

    private int studentID;
    private String studentName;
    private String studentAddress;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student2(int studentID, String studentName, String studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student2(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
