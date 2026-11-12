package practice8;
import java.util.Scanner;
public class Task12 {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        Task12 task=new Task12();
        task.solve();
    }
    private void solve(){
        int number;

        while (true) {
            if (!scanner.hasNext()) {
                return;
            }
            if (!scanner.hasNextInt()) {
                System.out.println("ошибка, введите целое число");
                scanner.next();
                continue;
            }
            number=scanner.nextInt();
            if (number<0) {
                System.out.println("введите положительное число!");
                continue;
            }
            break;
        }

            if (number==0){
                return;
            }
            if (number%2!=0){
                System.out.println(number);
            }

            solve();
    }
}
