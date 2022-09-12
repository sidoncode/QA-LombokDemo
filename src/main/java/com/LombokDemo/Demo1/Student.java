package com.LombokDemo.Demo1;

public class Student {

    private Integer studentID;
    private String studentName;
    private String studentClass;
    private String studentEmailAddress;
    private boolean studentPassed;
    private float studentMark;


    //default constructor
    public Student(){}

    // parametrized Constuctor
    public Student(Integer studentID, String studentName,String studentClass,String studentEmailAddress,Boolean studentPassed,
                   float studentMark){

        super();
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentEmailAddress = studentEmailAddress;
        this.studentPassed = studentPassed;
        this.studentMark = studentMark;
    }


    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentEmailAddress() {
        return studentEmailAddress;
    }

    public void setStudentEmailAddress(String studentEmailAddress) {
        this.studentEmailAddress = studentEmailAddress;
    }

    public boolean isStudentPassed() {
        return studentPassed;
    }

    public void setStudentPassed(boolean studentPassed) {
        this.studentPassed = studentPassed;
    }

    public float getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(float studentMark) {
        this.studentMark = studentMark;
    }

    @Override
    public String toString(){
        return "Student [StudentId = " + studentID + ",StudentName = "+ studentName + ",StudentClass = " + studentClass +
                " StudentEmail = "+ studentEmailAddress + " StudentPassed = " + studentPassed + "StudentMark = " + studentMark + " ]";
    }

    public static void main(String[] args) {
        // creating a object of Class Type - Student //
        Student student1 = new Student(1,"Anoop",
                "KG","anoop@123.com",true,1.01f);

        System.out.println(student1.toString());

        Student student2 = new Student(2,"Sid",
                "Nursery","sid@123.com",false,14.01f);

        System.out.println(student2.toString());

        Student student3 = new Student(3,"UnderTaker",
                "WWE","undertaker@123.com",true,31.0f);

        System.out.println(student3.toString());
    }

}
