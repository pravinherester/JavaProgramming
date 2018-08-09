package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Doe");
        e1.setPayRate(6000.0);
        e1.setDept(2);
        Employee e2 = new Employee();
        e1.setFirstName("Rahim");
        e1.setLastName("Bai");
        e1.setPayRate(7000.0);
        e1.setDept(1);
        Employee e3 = new Employee();
        e1.setFirstName("Ramesh");
        e1.setLastName("Aravind");
        e1.setPayRate(5000.0);
        e1.setDept(3);
        Employee e4 = new Employee();
        e1.setFirstName("Sachin");
        e1.setLastName("Tendulkar");
        e1.setPayRate(3000.0);
        e1.setDept(4);
        Employee e5 = new Employee();
        e1.setFirstName("Rahul");
        e1.setLastName("Dravid");
        e1.setPayRate(2000.0);
        e1.setDept(5);
        Employee e6 = new Employee();
        e1.setFirstName("Sourva");
        e1.setLastName("Ganguly");
        e1.setPayRate(1000.0);
        e1.setDept(6);

        List list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        
        Map <Integer,List<Employee>> map=(Map<Integer, List<Employee>>) list.stream().collect(Collectors.groupingBy(Employee :: getDept));
        System.out.println(map.get(1));

    }
}
