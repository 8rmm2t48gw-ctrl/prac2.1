package practice14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите текст с ценами ");
        String text=scanner.nextLine();

        String regex="(?<![\\p{L}\\d.])\\d+\\.\\d{2}\\s+(?:USD|RUB|RUВ|EU)(?![\\p{L}\\d])";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        boolean found=false;
        System.out.println("найденные цены ");

        while(matcher.find()) {
            System.out.println(matcher.group());
            found=true;
        }

        if(!found) {
            System.out.println("подходящих цен нет");
        }
    }
}
