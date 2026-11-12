package practice13;

public class Task2 {
    public static void main(String[] args) {
        Person[] people={
                new Person("Иванов","Иван","Иванович"),
                new Person("Петров","Пётр",null),
                new Person("Сидоров",null,"Сергеевич"),
                new Person("Кузнецов",null,null)
        };

        for(int i=0;i<people.length;i++) {
            System.out.println(people[i].getShortName());
        }
    }
}