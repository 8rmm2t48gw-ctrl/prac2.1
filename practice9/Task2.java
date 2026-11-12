package practice9;
public class Task2 {
    public static void main(String[] args) {
        Student[] students={
                new Student(105, "Анна", 78), new Student(102, "Иван", 95),
                new Student(109, "Ольга", 62), new Student(101, "Павел", 88),
                new Student(106, "Мария", 70)
        };
        System.out.println("до сортировки");
        printStudents(students);
        SortingStudentsByGPA sorter=new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length-1);
        System.out.println("после сортировки по убыванию баллов");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (int i=0; i<students.length; i++) {
            System.out.println(students[i].getIDNumber()+" - " +students[i].getName() + " - " +students[i].getFinalScore());
        }
    }
}
