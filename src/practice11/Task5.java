package practice11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Task5 {
    private static final int SIZE=10000;
    private static final int SEARCH_REPEATS=300;
    public static void main(String[] args) {
        System.out.println("сравнение ArrayList и LinkedList (в миллисекундах)");
        System.out.printf("%-23s %15s %15s%n","операция","ArrayList","LinkedList");
        printResult("добавление в конец",measureAdd(new ArrayList<>()),measureAdd(new LinkedList<>()));
        printResult("вставка в начало",measureInsert(new ArrayList<>()),measureInsert(new LinkedList<>()));
        printResult("удаление из начала",measureRemove(new ArrayList<>()),measureRemove(new LinkedList<>()));
        printResult("поиск по значению",measureSearch(new ArrayList<>()),measureSearch(new LinkedList<>()));
    }

    private static long measureAdd(List<Integer> list) {
        long start=System.nanoTime();

        for (int i=0;i<SIZE;i++) {
            list.add(i);
        }
        return System.nanoTime()-start;
    }
    private static long measureInsert(List<Integer> list) {
        long start=System.nanoTime();

        for (int i=0;i<SIZE;i++) {
            list.add(0,i);
        }

        return System.nanoTime()-start;
    }

    private static long measureRemove(List<Integer> list) {
        for (int i=0;i<SIZE;i++) {
            list.add(i);
        }

        long start=System.nanoTime();

        for (int i=0;i<SIZE;i++) {
            list.remove(0);
        }

        return System.nanoTime()-start;
    }

    private static long measureSearch(List<Integer> list) {
        for (int i=0;i<SIZE;i++) {
            list.add(i);
        }

        int foundCount=0;
        long start=System.nanoTime();

        for (int i=0;i<SEARCH_REPEATS;i++) {
            if (list.contains(SIZE-1)) {
                foundCount++;
            }
        }

        long elapsed=System.nanoTime()-start;

        if (foundCount!=SEARCH_REPEATS) {
            System.out.println("ошибка при поиске элемента.");
        }

        return elapsed;
    }

    private static void printResult(String operation,long arrayTime,long linkedTime) {
        System.out.printf("%-23s %15.3f %15.3f%n",operation,arrayTime/1_000_000.0,linkedTime/1_000_000.0);
    }
}
