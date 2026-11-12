package practice9;

public class Task1 {
    public static void main(String[] args) {
        Student[] students={
                new Student(105, "Анна"), new Student(102, "Иван"),
                new Student(109, "Ольга"), new Student(101, "Павел"),
                new Student(106, "Мария")
        };

        System.out.println("до сортировки ");
        printStudents(students);
        insertionSort(students);
        System.out.println("после сортировки ");
        printStudents(students);
    }

    private static void insertionSort(Student[] students) {
        for (int i=1; i<students.length; i++) {
            Student toInsert=students[i];
            int j=i-1;

            while (j>=0 && students[j].compareTo(toInsert)>0) {
                students[j+1]=students[j];
                j--;
            }

            students[j+1]=toInsert;
        }
    }

    private static void printStudents(Student[] students) {
        for (int i=0; i<students.length; i++) {
            System.out.println(students[i].getIDNumber()+" - "+students[i].getName());
        }
    }
}
