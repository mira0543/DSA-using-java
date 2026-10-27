package University_Exam_Registration_System;

import java.util.Scanner;
//main class
public class Main {
    //display method
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== EXAM REGISTRATION SYSTEM =====");
        System.out.println();
        System.out.println("Enter Student ID: ");
        String ID = scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age =scanner.nextInt();
        System.out.println("Enter your marks: ");
        double marks = scanner.nextDouble();
        System.out.println("Enter Number of subjects: ");
        int subjects = scanner.nextInt();
        System.out.println("==================");
        System.out.println();
        System.out.println();
        ExamRegistration student = new ExamRegistration(ID, name, age, marks, subjects);
        //Exception Handling
        try {
            student.ValidateRegistration();

        } catch (InvalidRegistrationException e) {
            System.out.println("Registration Failed!");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Registration attempt completed!");
        }



    }
}
