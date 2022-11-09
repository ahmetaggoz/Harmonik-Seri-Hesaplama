package Giris;
import java.util.Scanner;
public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.print("N sayısını girin : ");
        int n = baba.nextInt();
        double result = 0.0;

        for (double i = 1.0; i <= n; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
