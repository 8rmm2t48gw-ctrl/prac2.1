package practice8;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("введите целое число!");
            return;
        }
        int number=scanner.nextInt();
        if (number<=0) {
            System.out.println("введите натуральное число!");
            return;
        }
        printDigits(number);
    }

    private static void printDigits(int n) {
        System.out.println(n%10);
        if (n>=10) {
            printDigits(n/10);
        }
    }
}

