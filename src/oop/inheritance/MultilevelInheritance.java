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
