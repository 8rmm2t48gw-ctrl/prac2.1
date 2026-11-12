package practice10;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Анна", "Иванова", "Информатика", 2, "ИКБО-01-25");

        System.out.println("Имя: "+student.getName());
        System.out.println("Фамилия: "+student.getSurname());
        System.out.println("Специальность: "+student.getSpecialty());
        System.out.println("Курс: "+student.getCourse());
        System.out.println("Группа: "+student.getGroup());

        student.setCourse(3);

        System.out.println("Курс после изменения: "+student.getCourse());
    }
}
