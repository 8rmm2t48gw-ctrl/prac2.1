package practice9;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getFinalScore()>second.getFinalScore()) {
            return -1;
        }

        if (first.getFinalScore()<second.getFinalScore()) {
            return 1;
        }

        return 0;
    }

    public void quickSort(Student[] students, int left, int right) {
        if (left>=right) {
            return;
        }

        int pivotIndex=partition(students, left, right);

        quickSort(students, left, pivotIndex-1);
        quickSort(students, pivotIndex+1, right);
    }

    private int partition(Student[] students, int left, int right) {
        Student pivot=students[right];
        int position=left;

        for (int j=left; j<right; j++) {
            if (compare(students[j], pivot) < 0) {
                Student temp=students[position];
                students[position]=students[j];
                students[j]=temp;
                position++;
            }
        }
        Student temp=students[position];
        students[position]=students[right];
        students[right]=temp;
        return position;
    }
}
