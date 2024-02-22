import java.util.Scanner;

public class Java_01_FlightTicket {
    public static void main(String[] args) {
        double distance, price, ageDiscount, flightDiscount;
        int age, type;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz (Km): ");
        distance = scanner.nextDouble();
        System.out.print("Yaşınızı Giriniz: ");
        age = scanner.nextInt();
        System.out.println("Yolculuk Tipini Seçiniz:\n1-)Tek Yön\n2-)Gidiş-Dönüş");
        type = scanner.nextInt();
        price = distance * 0.10;

        if (age < 12) {
            ageDiscount = (price) * (0.5);
            price = price - ageDiscount;

        } else if (age > 12 && age < 24) {
            ageDiscount = (price) * (0.1);
            price = price - ageDiscount;

        } else if (age > 65) {
            ageDiscount = (price) * (0.3);
            price = price - ageDiscount;

        }

        if (distance<0 || age<0 ){
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        if (type == 2) {
            flightDiscount = price * (0.2);
            price = (price - flightDiscount)*2;
            System.out.println("Toplam Tutar: " + price + " ₺");
        } else if (type != 1 && type != 2) {
            System.out.println("Hatalı Veri Girdiniz");
            return;
        } else System.out.println("Toplam Tutar: " + price + " ₺");
    }
}


