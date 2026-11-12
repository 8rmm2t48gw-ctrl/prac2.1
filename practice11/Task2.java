package practice11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        format.setLenient(false);

        System.out.print("Введите дату и время (дд.мм.гггг чч:мм:сс): ");
        String input=scanner.nextLine();

        try {
            Date enteredDate=format.parse(input);
            Date currentDate=new Date();

            System.out.println("Введённая дата: "+format.format(enteredDate));
            System.out.println("Текущая дата: "+format.format(currentDate));

            if (enteredDate.before(currentDate)) {
                System.out.println("Введённая дата раньше текущей.");
            } else if (enteredDate.after(currentDate)) {
                System.out.println("Введённая дата позже текущей.");
            } else {
                System.out.println("Даты и время совпадают.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: введите дату в формате 10.11.2026 15:30:00");
        }
    }
}
