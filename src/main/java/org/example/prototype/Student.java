package org.example.prototype;

class Student implements Prototype {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printId() {

        System.out.println("Student Name is ==>" + name);
        System.out.println("Student ID is ==>" + id);
    }

    @Override
    public Prototype getClone() {
        return new Student(id, name);
    }
}
