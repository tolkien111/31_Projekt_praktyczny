package edu.sda.grcy.patterns.structual.proxy;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployees {

    static List<String> employees = new ArrayList<>();

    public CompanyEmployees(){
    }

    public static boolean isActiveEmployee (String employee){
        return employees.contains(employee);
    }

    public boolean addEmployee (String employee) {
        return employees.add(employee);
    }
    public boolean removeEmployee (String employee) {
        return  employees.remove(employee);
    }
}
