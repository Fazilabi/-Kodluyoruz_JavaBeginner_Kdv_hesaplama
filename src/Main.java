import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //kdv tutarini tanimlama
        double kdvSiz, kdvOrani=0.18, kdvLiTutar, kdvTutari;

        System.out.print("bir fiyat giriniz: ");
        kdvSiz = input.nextDouble();

        kdvTutari=kdvSiz*kdvOrani;
        kdvLiTutar = kdvSiz + kdvSiz*kdvOrani;

        System.out.println("kdvsiz tutar:" + kdvSiz);
        System.out.println("kdv orani :" + kdvOrani);
        System.out.println("kdv tutari :" + kdvTutari);
        System.out.println("kdv ile birlikte :" + kdvLiTutar);
    }
}