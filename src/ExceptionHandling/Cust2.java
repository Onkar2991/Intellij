package ExceptionHandling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cust2 extends RuntimeException{
    Cust2(String msg)
    {
        super(msg);
    }
}
class ok
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money to Withdraw: ");
        int money = sc.nextInt();

        try
        {
            if (money<=1000)
            {
                throw new Custom1("Plz enter the larger amount");
            }
            else
            {
                System.out.println("Money Withdrawed !!");
                System.out.println("Thank you !!!");
            }
        }
        catch (Custom1 e)
        {
            e.printStackTrace();
        }
    }
}
