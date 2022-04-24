package maps;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //verilen bir string deki harfleri ve harflerin kac kez kullanildigini return eden method yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir cumle giriniz: ");
        String input=scan.nextLine().toLowerCase(Locale.ROOT);

        String harflerArr[]=input.split("");
        Map<String,Integer> kullanimSayilari=new HashMap<>();

        for (String each:harflerArr
             ) {
            if (kullanimSayilari.containsKey(each)){
                kullanimSayilari.put(each, kullanimSayilari.get(each)+1);
            }else{
                kullanimSayilari.put(each,1);
            }

        }
        System.out.println(kullanimSayilari);


    }
}
