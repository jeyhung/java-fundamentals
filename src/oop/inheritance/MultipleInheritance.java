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
