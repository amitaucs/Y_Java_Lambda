package org.codetechies;

import org.codetechies.data.Employee;
import org.codetechies.utils.EmployeeDataUtils;

import java.util.ArrayList;
import java.util.List;

public class TraditionalWay {

    private static void printName1(List<Employee> empList){
        List<String> employeeNameList = new ArrayList<>();
        empList.forEach(employee -> {
            employeeNameList.add(employee.getName());
        });
        employeeNameList.forEach(name->{
            System.out.println(name);
        });
    }

    private static void printName2(List<Employee> empList){
        List<String> employeeNameList = new ArrayList<>();
        for(int i=0; i< empList.size(); i++){
            Employee employee = empList.get(i);
            employeeNameList.add(employee.getName());
        }
        for(int i=0; i< employeeNameList.size(); i++){
            System.out.println(employeeNameList.get(i));
        }
    }

    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataUtils.getAllEmployee();
        printName2(empList);

    }
}
