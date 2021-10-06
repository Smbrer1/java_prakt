package prakt6;

import java.util.Random;

public class Student {
    private String name;
    private int IdNumber;
    private int GPA;

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public Integer getGPA() {
        return GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void randomConstruct() {
        final Random random = new Random();
        setIdNumber(random.nextInt(100) + 1);
        String[] names = {"James", "Zinaida", "Artem", "Bob", "Tom", "Jake"};
        setName(names[random.nextInt(names.length)]);
        setGPA(random.nextInt(0, 100) / 10);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", IdNumber=" + IdNumber +
                ", GPA=" + GPA +
                '}';
    }

}
