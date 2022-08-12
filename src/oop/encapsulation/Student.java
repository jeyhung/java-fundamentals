package oop.encapsulation;

/**
 * Student class
 * @author Jeyhun Gasimov
 * @since 2022-08-12
 */
public class Student {
    public Student() {

    }

    /**
     * Student's full name: First name + last name
     * Defined as private instance variable
     */
    private String fullName;

    /**
     * Student's card number
     * Defined as public instance variable.
     * Note: This definition hasn't recommended
     */
    public String cardNumber;

    /**
     * Getter method for fullName variable for external users of class
     * @return Student's full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter method for fullName variable for external users of class
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
