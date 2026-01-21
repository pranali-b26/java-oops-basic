class A {
    int j;
    protected int i;

    void showij() {
        System.out.println("Inside class A: i = " + i + ", j = " + j);
    }
}

 
class B extends A {
    int k;

    void showk() {
        System.out.println("Inside class B: k = " + k);
    }

    void addijk() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}


class C extends A {
    int n;

    void shown() {
        System.out.println("Inside class C: n = " + n);
        System.out.println("i = " + i + ", j = " + j);
    }
}

 
public class InheritanceLevel {
    public static void main(String[] args) {
         
        A superObjA = new A();
        superObjA.i = 10;
        superObjA.j = 20;
        superObjA.showij();

         
        B subObjB = new B();
        subObjB.i = 100;  
        subObjB.j = 200;  
        subObjB.k = 30;   
        subObjB.showk();
        subObjB.addijk();

        
        C subObjC = new C();
        subObjC.i = 5;    
        subObjC.j = 15;   
        subObjC.n = 50;  
        subObjC.shown();
    }
}
