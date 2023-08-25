package OrtalamaHesaplayici;

import java.util.Scanner;



    public class OrtHes {
    public static void main(String[] args) {
        int mat, tar, muz, turk, kim, fiz;

   Scanner input = new Scanner(System.in);

        System.out.println("Ortalama hesaplayıcıya hoş geldiniz.\nOrtalamanız 50 ve üzeri ise geçersiniz.\nBol şans.");


        System.out.println("Matematik notunuzu girin :");
        mat = input.nextInt();

        System.out.println("Tarih notunuzu girin :");
        tar = input.nextInt();

        System.out.println("Müzik notunuzu girin :");
        muz = input.nextInt();

        System.out.println("Türkçe notunuzu girin :");
        turk = input.nextInt();

        System.out.println("Kimya notunuzu girin :");
        kim = input.nextInt();

        System.out.println("Fizik notunuzu girin :");
        fiz = input.nextInt();

int total = mat + tar + muz + turk + kim + fiz;
double ort = total / 6.0;
        System.out.println("Ortalamanız:"+ ort);

        int gecernot = 50;
        boolean gecme = ort >= gecernot;
        String kader = gecme ? "Tebrikler, sınıfı gectiniz!" : "Maalesef kaldınız :(";
        System.out.println(kader);

    }
}
