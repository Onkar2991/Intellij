package String;

class Immutable{
    public static void main(String args[])
    {
        Immute immute = new Immute(10,"ONKAR");
        immute.getA();
        immute.getB();
    }
}

final class Immute
{
    private int a ;
    private String b;

    Immute(int a , String b)
    {
        this.a=a;
        this.b=b;
    }

    public int getA()
    {
        System.out.println("The value is " +a);
        return a;
    }

    public String getB()
    {
        System.out.println("The value is " +b);
        return b ;
    }

}
 