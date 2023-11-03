package Singletone_Dp;

public class Double_locking {
    private static Double_locking doubleLocking;

    private Double_locking()
    {

    }

    public static  Double_locking getInstanceDoubleLocking()
    {
        if(doubleLocking==null)
        {
            synchronized (Double_locking.class)
            {
                if (doubleLocking==null)
                {
                    doubleLocking=new Double_locking();
                }
            }
        }
        System.out.println("double locking initialization for multithreaded application is done.");
        return doubleLocking;
    }
}


class test4
{
    public static void main(String[] args)
    {
        Double_locking aa= Double_locking.getInstanceDoubleLocking();
    }
}