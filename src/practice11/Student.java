package practice11;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private Date birthDate;

    public Student(String name,String surname,String specialty,int course,String group,Date birthDate) {
        this.name=name;
        this.surname=surname;
        this.specialty=specialty;
        this.course=course;
        this.group=group;
        this.birthDate=birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty=specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course=course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group=group;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate=birthDate;
    }

    public String getFormattedBirthDate(String format) {
        int style;

        if (format.equalsIgnoreCase("short")) {
            style=DateFormat.SHORT;
        } else if (format.equalsIgnoreCase("medium")) {
            style=DateFormat.MEDIUM;
        } else if (format.equalsIgnoreCase("full")) {
            style=DateFormat.FULL;
        } else {
            return "Неизвестный формат даты";
        }

        DateFormat formatter=DateFormat.getDateInstance(style,Locale.forLanguageTag("ru-RU"));
        return formatter.format(birthDate);
    }

    @Override
    public String toString() {
        return surname+" "+name+", "+specialty+", "+course+" курс, "+group+", дата рождения: "+getFormattedBirthDate("short");
    }
}