// File name: MyMain.java
class Cube {
    double width, height, depth;

    // Parameterized constructor
    Cube(double w, double h, double d) {
        System.out.println("Constructing cube...");
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume (void)
    void calVolume() {
        double volume = width * height * depth;
        System.out.println("Volume = " + volume);
    }
}

// Main class
public class MyMainVoid {
    public static void main(String[] args) {
        Cube c = new Cube(10, 10, 10);
        c.calVolume();
    }
}