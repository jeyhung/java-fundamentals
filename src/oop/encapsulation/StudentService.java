package oop.encapsulation;

/**
 * StudentService class
 * @author Jeyhun Gasimov
 * @since 2022-08-12
 */
public class StudentService {
    public static void main(String[] args) {
        Student student = new Student();

        /**
         * Setting fullName using setter method of Student
         */
        student.setFullName("Jeyhun Gasimov");

        /**
         * Setting cardNumber
         */
        student.cardNumber = "CN-000001";

        /**
         * Printing Student's full name
         * Using getter method for get value of private variable
         */
        System.out.printf("Student's full name: %s\n", student.getFullName());

        /**
         * Printing Student's card number
         */
        System.out.printf("Student's card number: %s\n", student.cardNumber);
    }
}
