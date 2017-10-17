package com.mehmetkoca;
import java.util.Scanner;
public class Main {
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
    }
    public static boolean kontrolEt(long deger){

        if(deger > 0 && deger < 100)
            return true;
        else return false;
    }

    public static void bul(long deger){
        System.out.println("Taşlar " + deger + " basamaklı " + fiboFunc(deger) + " farklı şekilde sıralanabilir.");
    }


    public static void main(String[] args) {
        System.out.println("0 ile 100 arasında taş sayısını girin: ");
        try{
            int stones = scanner.nextInt();
            while (!kontrolEt(stones)){
                System.out.println("0 ile 100 arasında değer girin: ");
                stones = scanner.nextInt();
            }
            bul(stones);
        }catch (Exception e)
        {
            System.out.println("Uygun değerler girilmediği için program sonlandı.");
        }

    }

    
}