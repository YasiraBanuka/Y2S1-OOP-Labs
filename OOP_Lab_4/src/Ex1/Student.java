package Ex1;

public class Student {

    private int studentID;
    private String name, degree, mobile;

    private static int max = 100; // static variable

    // create static method
    public static int getNextStudentID() {
        return max++;
    }

    public Student() {
    }

    // overloading constructor
    public Student(String name, String degree, String mobile) {
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
//        this.studentID = Student.getNextStudentID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // print method
    public void print() {
        System.out.println("Student ID : " + getNextStudentID());
//        System.out.println("Student ID : " + this.studentID);
        System.out.println("Student Name : " + getName());
        System.out.println("Degree : " + getDegree()); // can also use this.degree
        System.out.println("Mobile No. : " + this.mobile);
    }

}
