package Singletone_Dp;

//By using Static block in Eager initialization we can provide exception handling and also can control over instance.


public class Static_Block {
    private static Static_Block Sb;

    private Static_Block()
    {

    }

    // static block initialization for exception handling

    static
    {
        try
        {
            Sb =new Static_Block();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Static_Block getInstance()
    {
        System.out.println("Static block initialization of singgletone is created");
        return Sb;
    }
}

class Tests
{
    public static void main(String[] args) {
        Static_Block st =Static_Block.getInstance();


    }

}
