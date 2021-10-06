package prakt6;

public class testQuickSort {

    private static int partition(Student[] array, int begin, int end) {
        int pivot = array[end].getGPA();
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j].getGPA() <= pivot) {
                i++;

                Student swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        Student swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }

    public static void sortByGPA(Student[] array, int begin, int end) {

        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            sortByGPA(array, begin, partitionIndex - 1);
            sortByGPA(array, partitionIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int studentsSize = 50;
        Student[] students = new Student[studentsSize];
        int n = students.length;
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].randomConstruct();
        }

        System.out.println("Unsorted array:");

        for (Student oneStudent : students) {
            System.out.println(oneStudent.toString());
        }

        sortByGPA(students, 0, studentsSize - 1);

        System.out.println("Sorted array:");

        for (Student oneStudent : students) {
            System.out.println(oneStudent.toString());
        }


    }
}
