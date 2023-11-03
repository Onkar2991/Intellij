package String;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("java");
        System.out.println(stringBuffer.reverse());

        StringBuffer stringBuffer1=new StringBuffer("bijjamwar");
        System.out.println(stringBuffer1.delete(2,5));

        System.out.println(stringBuffer1.replace(0,6,"channa"));

        System.out.println(stringBuffer1.append("war"));

        System.out.println(stringBuffer1.insert(1,0.005));


    }
}
