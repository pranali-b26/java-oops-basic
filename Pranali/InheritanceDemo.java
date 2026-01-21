// File name: InheritanceDemo.java

// Superclass A
class A {
    protected int i; // accessible in subclass
    int j;

    // Method to show i and j
    void showij() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

// Subclass B inherits A
class B extends A {
    int k;

    // Method to show k
    void showk() {
        System.out.println("k = " + k);
    }

    // Method to add i, j, k
    void add() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Object of superclass
        A superObjA = new A();
        superObjA.i = 10;
        superObjA.j = 20;

        // Object of subclass
        B subObjB = new B();
        subObjB.i = 100;   // inherited
        subObjB.j = 200;   // inherited
        subObjB.k = 30;    // own member

        // Call methods
        superObjA.showij();
        subObjB.showk();
        subObjB.add();
    }
}