package University_Exam_Registration_System;


public class ExamRegistration {

    //Creating Attributes
    private String ID;
    private String name;
    private int age;
    private double marks;
    private int subjects;
    //constructor
    ExamRegistration(String ID, String name, int age, double marks,int subjects){
        this.ID=ID;
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.subjects=subjects;
    }
    //getter and setter
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
    public int getSubjects(){
        return subjects;
    }
    public void setSubjects(int subjects){
        this.subjects=subjects;
    }
    //Method validation
    public void ValidateRegistration() throws InvalidRegistrationException{
        if (age < 18){
            throw new InvalidRegistrationException("Student age must be at least 18 or older");
        }
        if(marks <0 || marks >100){
            throw new InvalidRegistrationException("Marks must be between 0 and 100");
        }
        if (subjects < 1 || subjects > 5){
            throw new InvalidRegistrationException("Subjects must be between 1 and 5");
        }

        if (ID == null || ID.trim().isEmpty()) {
             throw new InvalidRegistrationException("Student ID cannot be empty");
        }
    }


}
