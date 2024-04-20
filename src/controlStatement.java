import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class controlStatement {
    public static void main(String[] args)
    {
        int number1=30;
        int number2=30;

        if (number1<number2)
        {
            System.out.println(number1 + ":Küçüktür");
        }
        else if (number1>number2)
        {
            System.out.println(number1 + ":Büyüktür");
        }
        else
        {
            System.out.println("Sayılar Eşit");
        }

        /////////////////////////////////////////////////
        int assigment = 70;
        //DEVAMI GELECEK//

        /////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesap Bakiyenizi Giriniz:");
        double accountBalance = scanner.nextDouble();

        System.out.println("Çekmek İstediğiniz Miktarı Giriniz:");
        double amount = scanner.nextDouble();

        if(amount<accountBalance)
        {
            System.out.println("Para Çekme İşlemi Başarılı "+ "Güncel Bakiye: "+ accountBalance);
        }
        else{
            System.out.println("Bakiyeniz Yetersiz");
        }



    }
}
