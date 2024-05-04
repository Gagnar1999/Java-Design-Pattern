package org.example.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Student s = new Student(1, "Gagan");

        s.printId();

        Student s1 = (Student) s.getClone();

        s1.printId();

        s1.setId(4);
        s1.setName("Anmol");

        s1.printId();
        s.printId();
    }
}
