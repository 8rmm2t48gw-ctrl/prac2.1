package practice14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите строку: ");
        String text=scanner.nextLine();

        if(text.isBlank()) {
            System.out.println("строка пустая");
            return;
        }

        String[] parts=text.trim().split("[\\s,;.!?]+");

        System.out.println("элементы строки:");
        for(int i=0;i<parts.length;i++) {
            System.out.println((i+1)+": "+parts[i]);
        }
    }
}
