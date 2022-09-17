package org.codetechies;

import org.codetechies.data.Employee;
import org.codetechies.utils.EmployeeDataUtils;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataUtils.getAllEmployee();

        List<String> empNameList = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        empNameList.forEach(empName -> System.out.println(empName));
    }

}
