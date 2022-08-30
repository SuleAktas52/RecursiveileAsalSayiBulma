import java.util.Scanner;

public class MetotlarlaAsalSayi {
    static void f(int x, int i) {

       if (x == i) {
           System.out.println(x + " Asal Sayidir.");
           return;
       } else if (x <= 1) {
           System.out.println(x + " Asal Sayi degildir.(2'den kucuk asal sayi yoktur.)");
           return;
       } else if (x % i == 0) {
           System.out.println(x + " Asal Degildir. " + i + " ile bolunur.");
           return;
       }
       f(x, i + 1);
   }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Sayi Giriniz: ");
            int x = scan.nextInt();
            f(x, 2);

    }
}
