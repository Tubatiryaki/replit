package _15_Exceptions;

import java.util.Random;
import java.util.Scanner;

public class UserMain {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        4- UserMain isminde main için bir class cteate ediniz.
     5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
        active ve signedIn default olarak true, false atayabilirsiniz.
        id yi sistem otomatik versin.,

       */
        Object obj=new Object();
        System.out.println(obj);

        System.out.print("id giriniz: ");
        Random rnd=new Random();
        int id=rnd.nextInt(100);
        System.out.println(id);

        System.out.print("User name giriniz: ");
        String userName= scan.nextLine();

        System.out.print("pasword giriniz: ");
        String pasword= scan.nextLine();

        System.out.print("id giriniz: ");
        Random rnd2=new Random();
        int id2=rnd.nextInt(100);
        System.out.println(id);

        System.out.print("User name giriniz: ");
        String userName2= scan.nextLine();

        System.out.print("pasword giriniz: ");
        String pasword2= scan.nextLine();

    }


}
