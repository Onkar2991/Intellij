package String;
//only one object is created using new keyword
public class Xyz {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2= new String("java");
        System.out.println(s1.hashCode());//same
        System.out.println(s2.hashCode());//same
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
        s1.intern();//it pulls the object of heap memory to the scp
        s2.intern();
        System.out.println(s1.hashCode());//same
        System.out.println(s2.hashCode());//same
        System.out.println(s1==s1.intern());// hence proved
        System.out.println(s2==s2.intern());
        System.out.println(s1.equals(s1.intern()));
        System.out.println(s2.equals(s2.intern()));
    }
}
