package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Custom1 extends RuntimeException {
        Custom1(String msg)
        {
            super(msg);
        }
}

class main{
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("JAVA");
        list.add("PYTHON");
        list.add("GROOVY");

        String Language;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Language: ");
        Language=sc.nextLine();

        try
        {
            if (list.contains(Language))
            {
                throw new Custom1(Language+" is already present !!");
            }
            else
            {
                list.add(Language);
                System.out.println(Language+" is added!!");
            }
        }
        catch (Custom1 e)
        {
//            System.out.println("Exception catched !!");
            e.printStackTrace();
        }
    }
}
