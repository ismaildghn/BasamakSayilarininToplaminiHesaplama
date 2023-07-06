import java.util.Scanner;

public class BasamakSayilarininToplaminiHesaplama {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        int number;
        int lastNumber;
        int result = 0;
        int newNumber = 0;


        System.out.print("Sayı giriniz : ");
        number = imp.nextInt();
        newNumber = number;

        while(newNumber != 0){
            lastNumber = newNumber % 10;
            newNumber /= 10;
            result += lastNumber;
            }
        System.out.println(number + " Sayısının rakamlarının toplamı " + result);
        }
    }

