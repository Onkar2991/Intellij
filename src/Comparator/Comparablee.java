package Comparator;

import java.util.*;
class Comparablee implements Comparable<Comparablee>
{
    private String first_name;
    private String last_name;

    Comparablee(String first_Name ,String last_Name)
    {
        this.first_name=first_Name;
        this.last_name=last_Name;
    }

    public String getFirst_Name()
    {
        return first_name;
    }

    public void setFirst_Name(String First_Name)
    {
        this.first_name=first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    public void setLast_Name(String Last_Name)
    {
        this.last_name=last_name;
    }

    @Override
    public String toString()
    {
        return "{" +
                "First_Name"+" "+first_name+
                "Last_Name"+" "+last_name+"}" ;

    }
    @Override
    public int compareTo(Comparablee o)
    {
        return this.getFirst_Name().compareTo(o.first_name);
    }
    public static void main(String args[])
    {
        Comparablee veer= new Comparablee("ONKAR","BIJJAMWAR");
        Comparablee veer1= new Comparablee("SHUBHAM","BARUDE");
        Comparablee veer2= new Comparablee("AKASH","BIRADAR");

        List<Comparablee> list= new ArrayList<>();
        list.add(veer);
        list.add(veer1);
        list.add(veer2);
        Collections.sort(list);
        System.out.println(list);

    }

}