package com.logicbig.example;

import java.util.Arrays;
import java.util.List;

public enum EmployeeService {
    Instance;

    private final List<Employee> employees;

    EmployeeService() {
        employees = Arrays.asList(
                new Employee("1", "Jim", "IT"),
                new Employee("2", "Sara", "Sale"),
                new Employee("3", "Tom", "Admin"),
                new Employee("4", "Diana", "IT"),
                new Employee("5", "Tina", "Sale"),
                new Employee("6", "Joe", "Account"),
                new Employee("7", "Lara", "IT"),
                new Employee("8", "Charlie", "Sale")
        );
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(String value) {
        return employees.stream()
                        .filter(e -> e.getId().equals(value))
                        .findAny().orElse(null);
    }
}