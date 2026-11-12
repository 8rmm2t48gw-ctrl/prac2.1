package practice14;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите строку ");
        String text=scanner.nextLine();

        String regex="^abcdefghijklmnopqrstuv18340$";

        if(text.matches(regex)) {
            System.out.println("строка совпадает с образцом");
        } else {
            System.out.println("строка не совпадает с образцом");
        }
    }
}
