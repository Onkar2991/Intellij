package Singletone_Dp;

//Using synchronized we can create singleton class in multi-threading environment also but it can cause slow performance, so we can use Double check locking mechanism.

public class Lazy_ThreadSafe {
    private static Lazy_ThreadSafe instance;

    private Lazy_ThreadSafe()
    {

    }

    public static synchronized Lazy_ThreadSafe getInstance()
    {
        if (instance==null)
        {
            instance =new Lazy_ThreadSafe();
        }
        System.out.println("Lazy initialization with thread safe of singletone is created");
        return instance;
    }
}

class Test2
{
    public static void main(String[] args) {
        Lazy_ThreadSafe aa=Lazy_ThreadSafe.getInstance();
        Lazy_ThreadSafe st =Lazy_ThreadSafe.getInstance();
    }
}