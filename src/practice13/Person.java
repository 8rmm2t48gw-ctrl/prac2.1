package practice13;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname,String name,String patronymic) {
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }

    public String getShortName() {
        StringBuilder result=new StringBuilder(surname);
        boolean hasName=name!=null&&!name.isBlank();
        if(hasName) {
            result.append(' ').append(name.trim().charAt(0)).append('.');
        }
        if(patronymic!=null&&!patronymic.isBlank()) {
            if(!hasName) result.append(' ');
            result.append(patronymic.trim().charAt(0)).append('.');
        }
        return result.toString();
    }
}