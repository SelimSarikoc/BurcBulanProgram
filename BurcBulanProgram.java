import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        int month, day;

        Scanner imp = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Giriniz: ");
        month = imp.nextInt();

        System.out.print("Doğduğunuz Günü Giriniz: ");
        day = imp.nextInt();


        if ((month == 1) && (day <= 21)) {
            System.out.println("Oğlak");

        } else if (month == 1 && day > 21 && day <= 31) {
            System.out.println("Kova");

        } else if (month == 2 && day <= 19) {
            System.out.println("Kova");

        } else if (month == 2 && (day >= 20) && day <= 29) {
            System.out.println("Balık");

        } else if (month == 3 && day <= 20) {
            System.out.println("Balık");

        } else if (month == 3 && day >= 21 && day <= 31) {
            System.out.println("Koç");

        } else if (month == 4 && day <= 20) {
            System.out.println("Koç");

        } else if (month == 4 && day >= 21 && day <= 30) {
            System.out.println(" Boğa ");

        } else if (month == 5 && day <= 21) {
            System.out.println("Boğa");

        } else if (month == 5 && day >= 22 && day <= 31) {
            System.out.println("İkizler");

        } else if (month == 6 && day <= 22) {
            System.out.println("İkizler");

        } else if (month == 6 && day >= 23 && day <= 30) {
            System.out.println("Yengeç");

        } else if (month == 7 && day <= 22) {
            System.out.println("Yengeç");

        } else if (month == 7 && day >= 23 && day <= 31) {
            System.out.println("Aslan");

        } else if (month == 8 && day <= 22) {
            System.out.println("Aslan");

        } else if (month == 8 && day >= 23 && day <= 31) {
            System.out.println("Başak");

        } else if (month == 9 && day <= 22) {
            System.out.println("Başak");

        } else if (month == 9 && day >= 23 && day <= 30) {
            System.out.println("Terazi");

        } else if (month == 10 && day <= 22) {
            System.out.println("Terazi");

        } else if (month == 10 && day >= 23 && day <= 31) {
            System.out.println("Akrep");

        } else if (month == 11 && day <= 21) {
            System.out.println("Akrep");

        } else if (month == 11 && day >= 22 && day <= 30) {
            System.out.println("Yay");

        } else if (month == 12 && day <= 21) {
            System.out.println("Yay");

        } else if (month == 12 && day >= 21 && day <= 31) {
            System.out.println("Oğlak");

        } if ( day > 31 || month > 13 ){
            System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}