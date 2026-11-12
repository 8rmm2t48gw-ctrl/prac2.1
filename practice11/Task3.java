package practice11;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Task3 {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar(2007,Calendar.FEBRUARY,28);
        Date birthDate=calendar.getTime();
        Student student=new Student("Артём","Язев","Информатика",2,"КВБО-11-25",birthDate);

        System.out.println("данные студента ");
        System.out.println(student);
        System.out.println("короткий формат "+student.getFormattedBirthDate("short"));
        System.out.println("средний формат "+student.getFormattedBirthDate("medium"));
        System.out.println("полный формат "+student.getFormattedBirthDate("full"));
    }
}