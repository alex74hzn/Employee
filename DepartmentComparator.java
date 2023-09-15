package com.example.interfaces.employee;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartament().compareTo(o2.getDepartament());
    }
}