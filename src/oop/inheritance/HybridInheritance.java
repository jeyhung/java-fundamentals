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
