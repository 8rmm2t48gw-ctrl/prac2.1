package practice13;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String data) {
        String[] parts=data.split(",");
        id=parts[0].trim();
        name=parts[1].trim();
        color=parts[2].trim();
        size=parts[3].trim();
    }

    @Override
    public String toString() {
        return "Артикул: "+id+"\nНазвание: "+name+"\nЦвет: "+color+"\nРазмер: "+size;
    }
}