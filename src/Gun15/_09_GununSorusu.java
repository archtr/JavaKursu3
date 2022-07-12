package Gun15;

import Gun28._02_Soru.MyMath;

public class _09_GununSorusu {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


        for (int i=0;i<=255;i++){

              char harf= (char)i; // bilgisayar artık bu sayının tablodaki karakter karşılığını anlıyor.

            System.out.println(i+" - " + harf);
        }

        MyMath.getMax(3,4);
    }
}
