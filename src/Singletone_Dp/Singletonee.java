package Singletone_Dp;

public class Singletonee {
    private static Singletonee singletonee=null;

    private Singletonee()
    {

    }

    public static Singletonee getInstance()
    {
        if (singletonee==null)
        {
            singletonee=new Singletonee();
        }
        return singletonee;
    }
}

class Test
{
    public static void main(String[] args)
    {
        Singletonee singletonee=Singletonee.getInstance();

        Singletonee st =Singletonee.getInstance();
    }
}
