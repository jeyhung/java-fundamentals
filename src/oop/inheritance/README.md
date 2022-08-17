### Inheritance

Inheritance can be defined as the process where one class acquires 
the properties (methods and fields) of another. The class which 
inherits the properties of other is known as **subclass (derived class, 
child class)** and the class whose properties are inherited is known 
as **superclass (base class, parent class)**.

#### Inheritance syntax

**extends** is the keyword used to inherit the properties of a class.

```text
class Parent {
   .....
   .....
}

class Child extends Parent {
   ..... 
   .....
}
```

#### Types of Inheritance
1. **Single Inheritance** - In single inheritance, subclasses inherit 
the features of one superclass.

```java
package oop.inheritance;

/**
 * Single Inheritance example
 * @author Jeyhun Gasimov
 * @since 2022-08-13
 */
public class SingleInheritance {
    /**
     * Animal class
     */
    static class Animal {
        /**
         * Animal's name
         */
        private String name;

        /**
         * Getter method for name field
         *
         * @return Animal's name
         */
        public String getName() {
            return name;
        }

        /**
         * Setter method for name field
         *
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * Bird class
     */
    static class Bird extends Animal {
        /**
         * Bird's color
         */
        private String color;

        /**
         * Getter method for color field
         *
         * @return Bird's color
         */
        public String getColor() {
            return color;
        }

        /**
         * Setter method for color field
         *
         * @param color
         */
        public void setColor(String color) {
            this.color = color;
        }
    }

    public static void main(String[] args) {
        /**
         * Creating Bird's object
         */
        Bird bird = new Bird();

        /**
         * Setting bird name
         */
        bird.setName("Parrot");

        /**
         * Setting bird color
         */
        bird.setColor("Red-blue-yellow");

        /**
         * Printing bird's name
         */
        System.out.println("Bird's name: " + bird.getName());

        /**
         * Printing bird's color
         */
        System.out.println("Bird's color: " + bird.getColor());
    }
}

```

**Output**

```text
Bird's name: Parrot
Bird's color: Red-blue-yellow
```

2. **Multilevel Inheritance** - a derived class will be inheriting a base class and as well as the derived class also 
act as the base class to other class.

```java
package oop.inheritance;

/**
 * Multilevel Inheritance example
 * @author Jeyhun Gasimov
 * @since 2022-08-13
 */
public class MultilevelInheritance {
    /**
     * Animal class
     */
    static class Animal {
        /**
         * Animal's name
         */
        private String name;

        /**
         * Getter method for name field
         *
         * @return Animal's name
         */
        public String getName() {
            return name;
        }

        /**
         * Setter method for name field
         *
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * WildAnimal class
     */
    static class WildAnimal extends Animal {
        private final String type;

        /**
         * Type field setting when constructor invoked
         */
        public WildAnimal() {
            type = "Wild animal";
        }

        /**
         * Getter method for type field
         * Note: Type field is read-only field
         * @return
         */
        public String getType() {
            return type;
        }
    }

    /**
     * Lion class
     * Note: Lion class contains Animal and WildAnimal classes' properties
     */
    static class Lion extends WildAnimal {
        private double weight;

        public String getWeight() {
            return weight + " kg";
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setName("Alex");
        lion.setWeight(350);

        System.out.println("Lion's name: " + lion.getName());
        System.out.println("Lion's type: " + lion.getType());
        System.out.println("Lion's weight: " + lion.getWeight());
    }
}
```

**Output**
```text
Lion's name: Alex
Lion's type: Wild animal
Lion's weight: 350.0 kg
```

3. **Hierarchical Inheritance** - one class serves as a superclass (base class) for more than one subclass.

```java
package oop.inheritance;

/**
 * Hierarchical Inheritance example
 * @author Jeyhun Gasimov
 * @since 2022-08-13
 */
public class HierarchicalInheritance {
    /**
     * Animal class
     */
    static class Animal {
        /**
         * Animal's name
         */
        private String name;

        /**
         * Getter method for name field
         *
         * @return Animal's name
         */
        public String getName() {
            return name;
        }

        /**
         * Setter method for name field
         *
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }
    }

    static class Dog extends Animal {

    }

    static class Cat extends Animal {

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bolt");
        System.out.println("Dog's name: " + dog.getName());

        Cat cat = new Cat();
        cat.setName("Tomas");
        System.out.println("Cat's name: " + cat.getName());
    }
}
```

**Output**
```text
Dog's name: Bolt
Cat's name: Tomas
```

4. **Multiple Inheritance** - one class can have more than one superclass and inherit features from all parent classes. 
Please note that Java does not support multiple inheritances with classes. In java, we can achieve multiple inheritances 
only through Interfaces.

```java
package oop.inheritance;

public class MultipleInheritance {
    interface Animal {
        String getName();

        void setName(String name);
    }

    interface FarmAnimal {
        String getType();
    }

    interface Dog extends Animal, FarmAnimal {

    }

    interface Cat extends Animal, FarmAnimal {

    }

    static class BullDog implements Dog {
        private String name;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String getType() {
            return "Farm animal";
        }

        @Override
        public String toString() {
            return "BullDog {"
                    + " name: " + name
                    + ", type: " + getType()
                    + "}";
        }
    }

    public static void main(String[] args) {
        BullDog bullDog = new BullDog();
        bullDog.setName("Bully");
        System.out.println(bullDog.toString());

        System.out.println("BullDog instance of Animal: " + (bullDog instanceof Animal));
        System.out.println("BullDog instance of FarmAnimal: " + (bullDog instanceof FarmAnimal));
        System.out.println("BullDog instance of Dog: " + (bullDog instanceof Dog));
        System.out.println("BullDog instance of Cat: " + (bullDog instanceof Cat));
    }
}
```

**Output**

```text
BullDog { name: Bully, type: Farm animal}
BullDog instance of Animal: true
BullDog instance of FarmAnimal: true
BullDog instance of Dog: true
BullDog instance of Cat: false
```

5. **Hybrid Inheritance** - It is a mix of two or more of the above types of inheritance. Since java doesn’t support 
multiple inheritances with classes, hybrid inheritance is also not possible with classes. 

```java
package oop.inheritance;

/**
 * Hybrid Inheritance Example
 * @author Jeyhun Gasimov
 * @since 2022-08-17
 */
public class HybridInheritance {
    interface A {
        void methodA();
    }

    interface B extends A{
        void methodB();
    }

    interface C extends A{
        void methodC();
    }

    interface D extends B, C {

    }

    static class ChildClass implements D {

        @Override
        public void methodA() {
            System.out.println("Method A");
        }

        @Override
        public void methodB() {
            System.out.println("Method B");
        }

        @Override
        public void methodC() {
            System.out.println("Method C");
        }
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.methodA();
        childClass.methodB();
        childClass.methodC();
    }
}

```

**Output**

```text
Method A
Method B
Method C
```