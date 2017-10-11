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
    public static double fiboFunc(double stones) {
        if(stones == 1) {return 1;}
        if(stones == 2) {return 2;}

        double prev=0d, next=1d, result=0d;
        for (int i = 0; i < stones; i++) {
            result=prev+next;
            prev=next;
            next=result;
        }
        return result;

        //return fiboFunc(stones-1) + fiboFunc(stones-2);
    }
    public static void main(String[] args) {
        //System.out.println("Taşlar 15 basamaklı " + fiboFunc(15) + " farklı şekilde sıralanabilir.");
        System.out.println("Taş sayısını girin: ");

        while(!scanner.hasNextInt()) {


            System.out.println("lütfen rakam dışında bir şey girmeyin");
            scanner.next();

        }
        double stones = scanner.nextInt();
        boolean quit = false;
        System.out.println("Taşlar " + (int)stones + " basamaklı " + (int)fiboFunc(stones) + " farklı şekilde sıralanabilir.");
    }
}
