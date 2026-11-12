package practice13;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите имя файла: ");
        String fileName=scanner.nextLine();

        try {
            String text=Files.readString(Path.of(fileName),StandardCharsets.UTF_8).trim();
            if(text.isEmpty()) {
                System.out.println("файл пустой");
                return;
            }
            String[] words=text.split("\\s+");
            System.out.println("результат "+getLine(words));
        } catch(IOException e) {
            System.out.println("не удалось прочитать файл "+e.getMessage());
        }
    }

    private static String getLine(String[] words) {
        boolean[] used=new boolean[words.length];
        StringBuilder result=new StringBuilder();
        if(buildLine(words,used,-1,0,result)) {
            return result.toString();
        }
        return "невозможно составить цепочку из всех слов";
    }

    private static boolean buildLine(String[] words,boolean[] used,int previous,int count,StringBuilder result) {
        if(count==words.length) {
            return true;
        }

        for(int i=0;i<words.length;i++) {
            if(used[i]) {
                continue;
            }
            if(previous!=-1) {
                String lastWord=words[previous];
                char last=Character.toLowerCase(lastWord.charAt(lastWord.length()-1));
                char first=Character.toLowerCase(words[i].charAt(0));
                if(last!=first) {
                    continue;
                }
            }

            int oldLength=result.length();
            if(oldLength>0) {
                result.append(' ');
            }
            result.append(words[i]);
            used[i]=true;

            if(buildLine(words,used,i,count+1,result)) {
                return true;
            }

            used[i]=false;
            result.setLength(oldLength);
        }
        return false;
    }
}
