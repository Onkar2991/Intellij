package Singletone_Dp;

//Eager initialization is easy to implement but it may cause resource and CPU time wastage. Use it only if cost of initializing a class is less in terms of resources or your program will always need the instance of class.

public class Eager {

    private static final Eager eager = new Eager();

    private Eager()
    {

    }

    public static Eager getInstance()
    {
        System.out.println("its a singletone class");
        return eager;
    }
}

class Eager_Test
{
    public static void main(String[] args) {
        Eager aa= Eager.getInstance();//object of singletone will be created
        Eager ab =Eager.getInstance();// object of singletone will be created
        System.out.println(aa.hashCode());//hashcode will be same
        System.out.println(ab.hashCode());//hashcode will be same
    }
}
