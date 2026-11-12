package practice13;

public class Task1 {
    public static void main(String[] args) {
        processString("I like Java!!!");
    }

    private static void processString(String text) {
        if(text.isEmpty()) {
            System.out.println("строка пустая");
            return;
        }
        System.out.println("последний символ: "+text.charAt(text.length()-1));
        System.out.println("заканчивается на !!!: "+text.endsWith("!!!"));
        System.out.println("начинается на I like: "+text.startsWith("I like"));
        System.out.println("содержит Java: "+text.contains("Java"));
        int index=text.indexOf("Java");
        System.out.println("позиция Java: "+index);
        System.out.println("замена a на o: "+text.replace('a','o'));
        System.out.println("верхний регистр: "+text.toUpperCase());
        System.out.println("нижний регистр: "+text.toLowerCase());
        if(index!=-1) {
            System.out.println("вырезанная строка: "+text.substring(index,index+4));
        }
    }
}