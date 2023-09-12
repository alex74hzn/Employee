package com.example.interfaces.employee;

import java.util.Objects;

//Employees in a Company
//Создайте класс «Employee» с атрибутами employeeId, name, department, и salary.
//
//Пусть класс «Employee» реализует Comparable для сортировки сотрудников по зарплате.
//Создайте «ComparatorNameComparator», «ComparatorDepartmentComparator» и
// «ComparatorIdComparator» для сортировки по соответствующим атрибутам.
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String departament;
    private double salary;

    public Employee(int id, String name, String departament, double salary) {
        this.id = id;
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employee.getName()) && Objects.equals(getDepartament(), employee.getDepartament());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDepartament(), getSalary());
    }
}