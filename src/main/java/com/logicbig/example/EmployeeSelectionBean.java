package com.logicbig.example;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Arrays;
import java.util.List;

@ManagedBean(name = "empSelectBean")
@ViewScoped
public class EmployeeSelectionBean {

    private List<Employee> selectedEmployees;

    public void setSelectedEmployees(List<Employee> selectedEmployees) {
        this.selectedEmployees = selectedEmployees;
    }

    public List<Employee> getSelectedEmployees() {
        return selectedEmployees;
    }

    public List<Employee> getEmployees() {
        return EmployeeService.Instance.getAllEmployees();
    }
}