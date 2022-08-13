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
