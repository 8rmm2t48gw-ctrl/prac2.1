package practice10;
import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Student> firstList = new ArrayList<>();
        firstList.add(new Student("Анна", "Смирнова", "Информатика", 2, "ИКБО-01-25"));
        firstList.add(new Student("Ольга", "Волкова", "Информатика", 2, "ИКБО-01-25"));
        firstList.add(new Student("Мария", "Петрова", "Информатика", 2, "ИКБО-01-25"));

        ArrayList<Student> secondList = new ArrayList<>();
        secondList.add(new Student("Иван", "Иванов", "Информатика", 1, "ИКБО-02-26"));
        secondList.add(new Student("Павел", "Сидоров", "Информатика", 1, "ИКБО-02-26"));

        ArrayList<Student> allStudents= new ArrayList<>();
        allStudents.addAll(firstList);
        allStudents.addAll(secondList);

        System.out.println("первый список ");
        printStudents(firstList);

        System.out.println("второй список ");
        printStudents(secondList);

        System.out.println("общий список до сортировки ");
        printStudents(allStudents);
        ArrayList<Student> sortedStudents=mergeSort(allStudents);
        System.out.println("общий список после сортировки по фамилии ");
        printStudents(sortedStudents);
    }

    private static ArrayList<Student> mergeSort(ArrayList<Student> students) {
        if (students.size()<=1) {
            return students;
        }
        int middle=students.size()/2;

        ArrayList<Student> left=new ArrayList<>(students.subList(0, middle));

        ArrayList<Student> right=new ArrayList<>(students.subList(middle, students.size()));

        left=mergeSort(left);
        right=mergeSort(right);

        return merge(left, right);
    }


    private static ArrayList<Student> merge(ArrayList<Student> left, ArrayList<Student> right) {
        ArrayList<Student> result=new ArrayList<>();

        int i=0;
        int j=0;

        while (i<left.size() && j<right.size()) {

            if (compareStudents(left.get(i), right.get(j))<=0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i<left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j<right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }


    private static int compareStudents(Student first, Student second) {
        int result=first.getSurname().compareToIgnoreCase(second.getSurname());
        if (result==0) {
            return first.getName().compareToIgnoreCase(second.getName());
        }
        return result;
    }


    private static void printStudents(ArrayList<Student> students) {
        for (int i=0; i<students.size(); i++) {
            Student student=students.get(i);
            System.out.println(student.getSurname()+" "+student.getName()+" - "+student.getSpecialty()+", "+student.getCourse()+" курс, "+student.getGroup());
        }
    }
}
