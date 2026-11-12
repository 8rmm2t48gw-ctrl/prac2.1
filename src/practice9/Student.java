package practice9;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private String name;
    private int finalScore;

    public Student(int iDNumber, String name) {
        this.iDNumber=iDNumber;
        this.name=name;
    }


    public Student(int iDNumber, String name, int finalScore) {
        this.iDNumber=iDNumber;
        this.name=name;
        this.finalScore=finalScore;
    }

    public int getIDNumber() {
        return iDNumber;
    }
    public String getName() {
        return name;
    }
    public int getFinalScore() {
        return finalScore;
    }

    @Override
    public int compareTo(Student other) {
        if (this.iDNumber<other.iDNumber) {
            return -1;
        }
        if (this.iDNumber>other.iDNumber) {
            return 1;
        }
        return 0;
    }
}
