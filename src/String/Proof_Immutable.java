package String;

final class Proof_Immutable
{
    private final int a =10;
    private final int b= 20;

    public int getA()
    {
        System.out.println("the value of a : "+a);
        return a;
    }

    public int getB()
    {
        System.out.println("the value of b : "+b);
        return b;
    }

    Proof_Immutable(int a , int b)
    {
        System.out.println("constructor called");
    }

    public static void main(String[] args)
    {
        Proof_Immutable ab= new Proof_Immutable(30,40);
        ab.getA();
        ab.getB();
    }
}