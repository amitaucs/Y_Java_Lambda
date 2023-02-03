package org.codetechies;

import org.codetechies.data.Employee;
import org.codetechies.utils.EmployeeDataUtils;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {
        List<Employee> empList = EmployeeDataUtils.getAllEmployee();
        List<String> skillList = empList.stream()
                .map(Employee::getSkills)
                .flatMap(List::stream)
                .filter(skill -> skill.equalsIgnoreCase("Java"))
                .distinct()
                .collect(Collectors.toList()); //List<String>

        skillList.forEach(skill -> System.out.println(skill));
    }
}
