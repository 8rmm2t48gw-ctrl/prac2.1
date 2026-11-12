package practice14;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password=scanner.nextLine();
        String regex="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9_]{8,}";
        if(password.matches(regex)) {
            System.out.println("Пароль надежный");
        } else {
            System.out.println("Пароль ненадежный");
        }
    }
}
