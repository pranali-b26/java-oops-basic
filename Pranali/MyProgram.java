import java.util.*;

class Rectangle {
    float height;
    float width;

    // method to calculate area
    public void calArea() {
        System.out.println("Area = " + (height * width));
    }
}

public class MyProgram {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        r1.height = sc.nextFloat();

        System.out.print("Enter width: ");
        r1.width = sc.nextFloat();

        r1.calArea();   // calling method
    }
}
