package dz1;

import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", age " + age;
    }

    public void intoHumanAge() {
        System.out.println((name + "'s age in human years is " + age * 7 + " years"));
    }
}
