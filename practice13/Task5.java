package practice13;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите телефонный номер ");
        String input=scanner.nextLine().trim();

        PhoneNumber phone=new PhoneNumber(input);
        System.out.println("результат "+phone.getFormattedNumber());
    }
}