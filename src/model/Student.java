package model;

public class Student {
    private String id;
    private String name;
    private int age;
    private String grade;

    //Constructor

    public Student(String id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //Getters & Setters (Encapsulacion)
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " +id+ ", Name: " +name+ ", Age: " +age+ ", Grade: "+grade;
    }
}
