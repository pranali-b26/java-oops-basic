package Pranali;

class Person {
    String name;
    int age;
}

public class MyProgramPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Modi";
        p1.age = 71;

        p2.name = "Bachchan";
        p2.age = 80;

        System.out.println("p1 name = " + p1.name);
        System.out.println("p1 age = " + p1.age);

        System.out.println("p2 name = " + p2.name);
        System.out.println("p2 age = " + p2.age);
    }
}