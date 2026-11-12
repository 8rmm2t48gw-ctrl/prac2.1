package practice11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("год ");
        int year=scanner.nextInt();
        System.out.print("месяц (1-12): ");
        int month=scanner.nextInt();
        System.out.print("число: ");
        int day=scanner.nextInt();
        System.out.print("часы (0-23): ");
        int hour=scanner.nextInt();
        System.out.print("минуты (0-59): ");
        int minute=scanner.nextInt();
        Calendar calendar=new GregorianCalendar();
        calendar.clear();
        calendar.setLenient(false);
        calendar.set(year,month-1,day,hour,minute,0);

        try {
            Date date=calendar.getTime();
            SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy HH:mm");

            System.out.println("создан объект Calendar: "+format.format(calendar.getTime()));
            System.out.println("создан объект Date: "+format.format(date));
        } catch (IllegalArgumentException e) {
            System.out.println("ошибка, введены некорректные дата или время.");
        }
    }
}
