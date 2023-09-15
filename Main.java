package com.example.interfaces.employee;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("GHJ");
        company.addEmployee(new Employee(3,"John Johns", "Logistics", 2500));
        company.addEmployee(new Employee(1,"Phill Phillips", "Warehouse", 3100));
        company.addEmployee(new Employee(2,"Simona Jackson", "Production", 2300));
        IdComparator idComparator = new IdComparator();
        NameComparator nameComparator = new NameComparator();
        DepartmentComparator departmentComparator = new DepartmentComparator();
        Collections.sort(company.getEmployees(),idComparator);
        for(Employee e:company.getEmployees()) {
            System.out.println(e.toString());
        }
        System.out.println();

        Collections.sort(company.getEmployees(),nameComparator);
        for(Employee e:company.getEmployees()) {
            System.out.println(e.toString());
        }
        System.out.println();

        Collections.sort(company.getEmployees(),departmentComparator);
        for(Employee e:company.getEmployees()) {
            System.out.println(e.toString());
        }
        System.out.println();
    }
}