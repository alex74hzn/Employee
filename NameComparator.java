package com.example.interfaces.employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.compareTo(o2) - o2.compareTo(o1));
    }
}