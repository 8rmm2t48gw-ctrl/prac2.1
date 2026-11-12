package practice13;

public class Task3 {
    public static void main(String[] args) {
        String[] addresses={
                "Россия, Московская область, Москва, Тверская, 10, 2, 15",
                "Россия, Ленинградская область, Санкт-Петербург, Невский проспект, 25, 1, 8",
                "Беларусь, Минская область, Минск, Ленина, 7, 3, 20",
                "Казахстан, Алматинская область, Алматы, Абая, 12, 1, 45"
        };

        System.out.println("Разбор с помощью split():");
        for(int i=0;i<addresses.length;i++) {
            System.out.println(Address.parseWithSplit(addresses[i]));
        }

        String[] mixedAddresses={
                "Россия; Московская область. Москва, Тверская; 10. 2, 15",
                "Россия. Ленинградская область; Санкт-Петербург, Невский проспект. 25; 1, 8",
                "Беларусь, Минская область; Минск. Ленина, 7; 3. 20",
                "Казахстан; Алматинская область, Алматы. Абая; 12, 1. 45"
        };

        System.out.println("Разбор с помощью StringTokenizer:");
        for(int i=0;i<mixedAddresses.length;i++) {
            System.out.println(Address.parseWithTokenizer(mixedAddresses[i]));
        }
    }
}