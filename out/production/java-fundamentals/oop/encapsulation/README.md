### Encapsulation

Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code 
and the data it manipulates. Another way to think about encapsulation is, that it is a protective shield that prevents 
the data from being accessed by the code outside this shield.

Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only 
through any member function of its own class in which it is declared.

As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved 
by making the members or methods of a class private, and the class is exposed to the end-user or the world without 
providing any details behind implementation using the abstraction concept, so it is also known as a combination of 
data-hiding and abstraction.

Encapsulation can be achieved by declaring all the variables in the class as private and writing public methods 
in the class to set and get the values of variables.
It is more defined with the setter and getter method.

### Advantages of Encapsulation:

1. **Data Hiding**: Encapsulation provides a way for data hiding. The user will have no idea about the inner implementation 
of the class. It will not be visible to the user how the class is storing values in the variables. The user will 
only know that we are passing the values to a setter method and variables are getting initialized with that value.
2. **Flexibility**: We can make the variables of the class read-only or write-only depending on our requirement.
3. **Re-usability**: Encapsulation also improves the re-usability and is easy to change with new requirements.
4. **Easy Testing**: Encapsulated code is easy to test for unit testing.

##### Student class
```java
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
```

##### StudentService class
```java
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

```

Output
```
Student's full name: Jeyhun Gasimov
Student's card number: CN-000001
```