package JavaProjects.tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {

    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */
        Random rnd = new Random();
        int rSayi = rnd.nextInt(100);
int sayac=0;

        int tahmin;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayi tahmin ediniz");
            tahmin = scan.nextInt();
            if (tahmin > rSayi) System.out.println("Daha kucuk bir sayi giriniz");
            else if (tahmin < rSayi) System.out.println("Daha buyuk bir sayi giriniz");
            else if (tahmin==rSayi) System.out.println("Tebrikler dogru tahmin ettiniz");
            sayac++;
        } while (tahmin != rSayi);
        System.out.print("Tahmin sayiniz: "+ sayac);


    }
}
