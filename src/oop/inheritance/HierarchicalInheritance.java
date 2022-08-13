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
