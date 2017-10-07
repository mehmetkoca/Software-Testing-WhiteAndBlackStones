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
    public static int fiboFunc(int stones) {
        if(stones == 1) {return 1;}
        if(stones == 2) {return 2;}
        return fiboFunc(stones-1) + fiboFunc(stones-2);
    }
    public static void main(String[] args) {
        System.out.println("Taş sayısını girin: ");
        int stones = scanner.nextInt();
        System.out.println("Taşlar " + stones + " basamaklı " + fiboFunc(stones) + " farklı şekilde sıralanabilir.");
    }
}
