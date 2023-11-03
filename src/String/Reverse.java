package String;

public class Reverse {
    public static void main(String[] args) {
        String string ="ONKAR";
        String reverse="";
        char ch;

        for (int i=0;i<string.length();i++)
        {
            ch=string.charAt(i);
            reverse = ch+reverse;
        }
        System.out.println(reverse);
    }
}
class aa
{
    public static void main(String[] args) {
        String name= "ONKAR";
        for (int i= name.length()-1;i>=0;i-- ){
            System.out.print(" first line op : ");
            System.out.println( name.charAt(i) );
        }
        String rev="";
            for(int i = 0;i<name.length();i++){
                char ch = name.charAt(i);
                rev = ch+rev;
            }

            System.out.println(" reverse name = "+ rev);
    }
}