// File name: AccountDemo.java
class Balance {
    int accNo;
    double bal;

    // Constructor 1: no parameters
    Balance() {
        System.out.println("inside const1");
        bal = 0;
    }

    // Constructor 2: one parameter
    Balance(double b) {
        System.out.println("inside const2");
        bal = b;
    }

    // Constructor 3: two parameters
    Balance(int a, double b) {
        System.out.println("inside const3");
        accNo = a;
        bal = b;
    }
}

// Main class
public class AccountDemo {
    public static void main(String[] args) {
        Balance b1 = new Balance();          // Calls constructor 1
        Balance b2 = new Balance(100);       // Calls constructor 2
        Balance b3 = new Balance(1201, 10000); // Calls constructor 3

        System.out.println("b1.bal = " + b1.bal);
        System.out.println("b2.bal = " + b2.bal);
        System.out.println("b3.bal = " + b3.bal + ", b3.accNo = " + b3.accNo);
    }
}
