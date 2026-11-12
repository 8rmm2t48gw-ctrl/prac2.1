package practice13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String country,String region,String city,String street,String house,String building,String apartment) {
        this.country=country;
        this.region=region;
        this.city=city;
        this.street=street;
        this.house=house;
        this.building=building;
        this.apartment=apartment;
    }

    public static Address parseWithSplit(String text) {
        String[] parts=text.split(",",-1);
        return createAddress(parts);
    }

    public static Address parseWithTokenizer(String text) {
        StringTokenizer tokenizer=new StringTokenizer(text,",.;");
        if(tokenizer.countTokens()!=7) {
            throw new IllegalArgumentException("В адресе должно быть 7 частей");
        }
        String[] parts=new String[7];
        for(int i=0;i<parts.length;i++) {
            parts[i]=tokenizer.nextToken();
        }
        return createAddress(parts);
    }

    private static Address createAddress(String[] parts) {
        if(parts.length!=7) {
            throw new IllegalArgumentException("в адресе должно быть 7 частей");
        }
        return new Address(parts[0].trim(),parts[1].trim(),parts[2].trim(),parts[3].trim(),parts[4].trim(),parts[5].trim(),parts[6].trim());
    }

    @Override
    public String toString() {
        return "Страна: "+country+", регион: "+region+", город: "+city+", улица: "+street+", дом: "+house+", корпус: "+building+", квартира: "+apartment;
    }
}
