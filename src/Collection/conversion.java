package Collection;

//conversion of list to the map

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class conversion {
  String first_name ;
  String last_name;
  int age;
  int id;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "conversion{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }



    public conversion(String first_name, String last_name, int age, int id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.id = id;
    }
    public static void main(String[] args) {
        conversion c1 = new conversion("onkar","bijjamwar",24,1);
        conversion c2 = new conversion("akash","biradar",25,2);
        conversion c3= new conversion("shubham","barude",26,3);

        ArrayList<conversion> ok= new ArrayList<conversion>();

        ok.add(c1);
        ok.add(c2);
        ok.add(c3);

        System.out.println(ok);

        Map<Integer,String> m1 = new HashMap<Integer,String>();
        for (conversion o:ok
             )
        {
            m1.put(o.getId(), o.getFirst_name());
        }
        System.out.println(m1);

        Map<Integer,String> M2=ok.stream().collect(Collectors.toMap(conversion::getId,conversion::getFirst_name));
        System.out.println(M2);

        Map<Integer,String> M3=ok.stream().collect(Collectors.toMap(x->x.getId(),x-> c1.getFirst_name()));
        System.out.println(M3);

    }


}

