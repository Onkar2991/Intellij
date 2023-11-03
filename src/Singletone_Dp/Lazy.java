package Singletone_Dp;

public class Lazy {
    private static Lazy As;

    private Lazy()
    {

    }

    public static Lazy getInstance()
    {
        if (As==null)
        {
             As= new Lazy();
        }
        System.out.println("lazy initialization of singletone is created");
        return As;
    }
}

class Test1
{
    public static void main(String[] args)
    {
        Lazy aa= Lazy.getInstance();
    }
}
