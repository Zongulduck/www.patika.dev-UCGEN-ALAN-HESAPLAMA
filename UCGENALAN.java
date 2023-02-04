import java.util.Scanner;
public class UCGENALAN {
    public static void main(String[] args) {
        double a,b,c,d,e;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenarın uzunluğunu giriniz;");
        a=input.nextDouble();
        System.out.println("2.Kenarın uzunluğunu giriniz;");
        b=input.nextDouble();
        System.out.println("3.Kenarın uzunluğunu giriniz;");
        c=input.nextDouble();
        d=(a+b+c)/2;
        System.out.println("Üçgenin çevresi; " );
        System.out.println(d*2);
         e=d*(d-a)*(d-b)*(d-c);
        System.out.println("Üçgenin Alanı; " );
        System.out.print(Math.sqrt(e));

    }
}
