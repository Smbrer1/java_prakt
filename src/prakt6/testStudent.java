package prakt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testStudent {

    public static void sortById(Student[] array){
        int n = array.length;
        for (int j = 1; j < n; j++) {
            Student oneStudent = array[j];
            int key = array[j].getIdNumber();
            int i = j-1;
            while ( (i > -1) && ( array[i].getIdNumber() > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = oneStudent;
        }
    }

    public static void main(String[] args){
        int studentsSize = 5;
        Student[] students = new Student[studentsSize];
        int n = students.length;
        for(int i = 0; i < n;i++) {
            students[i]=new Student();
            students[i].randomConstruct();
        }

        System.out.println("Unsorted array:");

        for (Student oneStudent: students){
            System.out.println(oneStudent.toString());
        }

        System.out.println("Sorted array:");

        sortById(students);
        for (Student oneStudent: students){
            System.out.println(oneStudent.toString());
        }


    }
}
