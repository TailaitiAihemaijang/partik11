import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/3/2023 10:35 AM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int math,fizik,turkce,kimya,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matimatik Notunuzu Giriniz :");
        math = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz :");
        fizik = input.nextInt();
        System.out.print("Turkce Notunuzu Giriniz :");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = input.nextInt();
        System.out.print("Muzik Notunuzu Giriniz :");
        muzik = input.nextInt();
        double ortalama = (math + fizik + turkce + kimya + muzik)/5;
        if (ortalama>55){
            System.out.println("Gectiniz Tebrikler");
        }else {
            System.out.println("Uzgunum kaldiniz ");
        }
        System.out.println("Sizin Ortalama Puaniz" + ortalama);
    }
}
