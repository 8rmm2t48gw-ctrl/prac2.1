package practice8;
import java.util.Scanner;
public class Task13 {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        new Task13().solve();
    }
    private void solve() {
        int first=readNumber();
        if (first<=0) {
            return;
        }
        System.out.println(first);
        int second=readNumber();
        if (second<=0) {
            return;
        }
        solve();
    }
    private int readNumber() {
        while (true) {
            if (!scanner.hasNext()) {
                return -1;
            }
            if (!scanner.hasNextInt()) {
                System.out.println("введите целое число!");
                scanner.next();
                continue;
            }
            int n=scanner.nextInt();
            if (n<0) {
                System.out.println("введите натуральное число или 0");
                continue;
            }
            return n;
        }
    }
}
