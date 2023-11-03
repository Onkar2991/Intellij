package JAVA_8;

import java.security.KeyStore;
import java.util.*;
import java.util.logging.LogManager;
import java.util.stream.Collectors;

public class Employee {

    int id;
    String Department;
    int age;
    int yearOfJoining;
    String name;
    String gender;
    Double salary;

    public Employee(int id, String department, int age, int yearOfJoining, String name, String gender, Double salary) {
        this.id = id;
        Department = department;
        this.age = age;
        this.yearOfJoining = yearOfJoining;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee(1,"Hr",20,2011,"onkar","male",25000.0));
        emp.add(new Employee(5,"Sales",25,2015,"Akash","male",20000.00));
        emp.add(new Employee(3,"Sales" ,22,2012,"kanchan","female",75000.00));
        emp.add(new Employee(11,"Account",24,2012,"Shraddha","female",56000.00));
        emp.add(new Employee(12,"Development",21,2024,"angad","male",50000.00));
        emp.add(new Employee(10,"Account",26,2022,"vijay","male",56000.00));
        emp.add(new Employee(7,"Finance",22,2027,"Shraddha","female",50000.00));
        emp.add(new Employee(55,"Development",27,2024,"Shubham","male",42520.00));

//        Map<String,Long> noOfEmployees=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println(noOfEmployees);

//        emp.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

//        Map<String,Double> Average=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//        System.out.println(Average);
//
//        Optional<Employee> Details=emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//        Employee highestPaid =  Details.get();
//        System.out.println("Details of highest paid employee are : ");
//        System.out.println("==========================================");
//        System.out.println("Id: "+highestPaid.getId());
//        System.out.println("Department: "+highestPaid.getDepartment());
//        System.out.println("Age: "+highestPaid.getAge());
//        System.out.println("name: "+highestPaid.getName());



//        emp.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);

//        Map<String, Long> Count=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(Count);

//        Map<String,Double> AverageSal=emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(AverageSal);

//        Optional<Employee> YoungestMaleEmp=emp.stream().filter(e->e.getGender()=="male"&&e.getDepartment()=="Development").min(Comparator.comparingInt(Employee::getAge));
//        System.out.println(YoungestMaleEmp);

//        Map<String ,Double> AvgSal=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(AvgSal);

//        Map<String, List<Employee>> ListByDept =emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        Set<Map.Entry<String,List<Employee>>> entrySet= ListByDept.entrySet();
//        for (Map.Entry<String,List<Employee>> entry:entrySet)
//        {
//            System.out.println("----------------------");
//            System.out.println("Employess in "+entry.getKey());
//            System.out.println("---------------------------");
//
//            List<Employee> list = entry.getValue();
//
//            for (Employee e:list)
//            {
//                System.out.println(e.getName());  for printing the names of employees in the dept
//            }
//        }

//        *for getting summary use DoubleSummaryStatistics it gives average sum max min
//        DoubleSummaryStatistics employeeSallaryStatistics=emp.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println("Average Salary = "+employeeSallaryStatistics.getAverage());
//        System.out.println("Total salary = "+employeeSallaryStatistics.getSum());
//        System.out.println("Max salary = "+employeeSallaryStatistics.getMax());






    }
}