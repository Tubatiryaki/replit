package _15_Exceptions;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        randomSayi();
    }

    private static void randomSayi() {
        Random rnd = new Random();
        int sayi1 = rnd.nextInt(10);
        System.out.println(sayi1);
        int sayi2 = rnd.nextInt(10);
        System.out.println(sayi2);
        int toplam = sayi1 + sayi2;



            if (toplam < 12){
                throw new ArithmeticException(("Sayı 12'den küçük ise hata verir"));
            }else {
                System.out.println(toplam);

            }



    }

}
