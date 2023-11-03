package ExceptionHandling;

import java.util.Scanner;

class YoungerException extends RuntimeException{
    YoungerException(String msg)
    {
        super(msg);
    }
}

 class Ex{
    public static void main(String[] args) {
        int age ;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age: ");
        age= sc.nextInt();
        try
        {
            if (age<=18)
            {
                throw new YoungerException("you are not eligible for voting ");
            }
            else
            {
                System.out.println("you are eligible for voting");
            }
        }
        catch (YoungerException e)
        {
//            System.out.println("Exception catched !!!");
            e.printStackTrace();
        }

    }

}
