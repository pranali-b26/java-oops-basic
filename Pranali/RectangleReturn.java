import java.util.*;

class RectangleReturn {
    float height;
    float width;

    public float calArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectangleReturn r1 = new RectangleReturn();

        System.out.print("Enter height: ");
        r1.height = sc.nextFloat();

        System.out.print("Enter width: ");
        r1.width = sc.nextFloat();

        float area = r1.calArea();
        System.out.println("Area = " + area);
    }
}