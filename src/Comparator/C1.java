package Comparator;

import java.util.*;
class C1
{
    private String f_name ;
    private String l_name;
    private int age ;
    private int id ;

    C1(String f_name , String l_name, int age ,int id)
    {
        this.f_name=f_name;
        this.l_name=l_name;
        this.age=age;
        this.id=id;
    }

    public String getF_name()
    {
        return f_name;
    }
    public void setF_name(String f_name)
    {
        this.f_name=f_name;
    }

    public String getL_name()
    {
        return l_name;
    }
    public void setL_name()
    {
        this.l_name=l_name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age )
    {
        this.age=age;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id ;
    }


    @Override
    public String toString()
    {
        return"{" + "f_name " + f_name+" l_name " +l_name+ " id : " +id+" age : "+age+"}";
    }


    public static void main (String args[])
    {
        C1 c= new C1("onkar","bijjamwar",24,2);
        C1 c1= new C1("shubham","barude",27,1);

        List<C1> ok= new ArrayList<C1>();
        ok.add(c);
        ok.add(c1);

 On no = new On();
Collections.sort(ok,no);
System.out.println(ok);

Age aa= new Age();
Collections.sort(ok,aa);
System.out.println(ok);

        Id as= new Id();
        Collections.sort(ok,as);
        System.out.println(ok);


    }


}
class On implements Comparator<C1>
{
    public int compare(C1 o1, C1 o2)
    {
        return o1.getF_name().compareTo(o2.getF_name());
    }
}

class Age implements Comparator<C1>
{
    public int compare(C1 a1 ,C1 a2)
    {
        return a1.getAge()-a2.getAge();
    }
}

class Id implements Comparator <C1>
{
    public int compare(C1 b1, C1 b2)
    {
        return b1.getId()-b2.getId();
    }
} 