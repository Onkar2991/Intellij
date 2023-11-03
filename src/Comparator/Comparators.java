package Comparator;

import java.util.*;
class Comparators
{
    private String name ;
    private int age;

    Comparators (String name , int age )
    {
        this.name=name;
        this.age= age;
    }

    public String getName()
    {
        return this.name=name;
    }

    public String setName(String name)
    {
        return name;
    }

    public int getAge()
    {
        return this.age=age;
    }

    public int setAge(int age)
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "{"+"name : "+name+" age : " +age+ "}";
    }
    public static void main(String args[])
    {
        Comparators c1= new Comparators("Onkar",24);
        Comparators c2=new Comparators("Akash",23);

        List<Comparators> ok= new ArrayList<>();
        ok.add(c1);
        ok.add(c2);
        Name1 ok1=new Name1();
        Collections.sort(ok,ok1);
        System.out.println(ok);
    }
}



class Name1 implements Comparator<Comparators>
{

    public int compare(Comparators o1 , Comparators o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}
