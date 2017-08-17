package school;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    // Gets the name set by the setter
    public String getName(){
        return name;
    }
    // Sets the name for the student
    public void setName(String aname){
        name = aname;
    }

    // getting a studnet ID
    public int getStudentId(){
        return studentId;
    }
    // setting the students ID
    public void setStudentId(int astudentid){
        studentId = astudentid;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double aGPA){
        gpa = aGPA;
    }
}
