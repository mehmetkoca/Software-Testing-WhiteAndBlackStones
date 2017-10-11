package com.mehmetkoca;
import java.util.Scanner;
public class Main {
    //Taş sayıları ardışık olarak artırıldığında çıkan değerlerin fibonacci serisi şeklinde arttığı görülüyor.
    //İlk taşın her zaman beyaz olduğunu kabul ediyoruz. Sonraki sıralamalarda ikinci taşı bir siyah ve bir beyaz
    //olarak sabitliyoruz. beyaz sabitlediğimizde olasılıklardan sabitlenen taşın sütununu çıkardığımızda
    //bir önceki sıralama ihtimallerinde elde edildiği görülüyor.
    //İkinci taşı siyah taş olarak sabitlersek (yani bs olarak) ve bu iki sutunu görmeden incelersek iki önceki
    //sıralama ihtimallerinde elde edildiği görülüyor.
    //Taş sayısının iki önceki ve bir önceki sıralama ihtimallerinin toplamı istenen sayının sıralama ihtimallerini veriyor.
    private static Scanner scanner = new Scanner(System.in);
    public static long fiboFunc(long stones) {
        if(stones == 1) {return 1;}
        if(stones == 2) {return 2;}

        long prev=0, next=1, result=0;
        for (int i = 0; i < stones; i++) {
            result=prev+next;
            prev=next;
            next=result;
        }
        return result;

        //return fiboFunc(stones-1) + fiboFunc(stones-2);
    }
    public static boolean kontrolEt(long deger){

        if(deger > 0 && deger < 10000)
            return true;
        else return false;
    }

    public static void bul(long deger){


        System.out.println("Taşlar " + deger + " basamaklı " + fiboFunc(deger) + " farklı şekilde sıralanabilir.");
    }


    public static void main(String[] args) {


        System.out.println("Taş sayısını girin: ");


        try{

            long stones = scanner.nextInt();
            while (!kontrolEt(stones)){
                System.out.println("lütfen yüzbin ile 0 arasında bir değer girin");
                stones = scanner.nextInt();

            }
            bul(stones);

        }catch (Exception e)
        {
            System.out.println("Sayı dışında değer girdiğinizden program kendini sonlandırdı");
        }

    }
}
