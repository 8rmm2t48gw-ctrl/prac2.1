package practice11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy HH:mm");
        format.setLenient(false);

        System.out.print("введите свою фамилию ");
        String surname=scanner.nextLine();

        System.out.print("введите дату и время получения задания (дд.мм.гггг чч:мм) ");
        String input=scanner.nextLine();

        try{
            Date receivedDate=format.parse(input);
            Date submittedDate=new Date();

            System.out.println("фамилия разработчика: "+surname);
            System.out.println("задание получено: "+format.format(receivedDate));
            System.out.println("дата и время сдачи: "+format.format(submittedDate));
        } catch (ParseException e){
            System.out.println("ошибка, введите дату в формате 10.11.2026 15:30");
        }
    }
}