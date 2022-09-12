package org.codetechies.utils;

import org.codetechies.data.Car;
import org.codetechies.data.Employee;
import org.codetechies.data.Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class EmployeeDataUtils {

    public static List<Employee> getAllEmployee(){

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Employee employee1 = Employee.builder().name("Akash")
                .gender("male")
                .skillLevel(3)
                .rating(3.5)
                .car(Optional.empty())
                .skills(Arrays.asList("Java","React"))
                .projects(Arrays.asList(Projects.builder().name("Bank_Of_America_Alpha").clientName("Bank of America").build(),
                        Projects.builder().name("State_Bank_Of_India_Alpha").clientName("State Bank of India").build()))
                .build();

        Employee employee2 = Employee.builder().name("Ravi")
                .gender("male")
                .skillLevel(4)
                .rating(4.5)
                .car(Optional.empty())
                .skills(Arrays.asList("Java","Angular"))
                .projects(Arrays.asList(Projects.builder().name("Visa_Alpha").clientName("Visa").build(),
                        Projects.builder().name("ICICI_Alpha").clientName("ICICI").build()))
                .build();

        Employee employee3 = Employee.builder().name("Deepika")
                .gender("female")
                .skillLevel(4)
                .rating(5)
                .car(Optional.empty())
                .skills(Arrays.asList(".Net","Node"))
                .projects(Arrays.asList(Projects.builder().name("Paypal_Alpha").clientName("Paypal").build(),
                        Projects.builder().name("HDFC_Alpha").clientName("HDFC").build()))
                .build();

        Employee employee4 = Employee.builder().name("Rekha")
                .gender("female")
                .skillLevel(2)
                .rating(2)
                .car(Optional.of(Car.builder().model("Nexon").made("Tata Motor").build()))
                .skills(Arrays.asList(".Net","Node"))
                .projects(Arrays.asList(Projects.builder().name("Paypal_Alpha").clientName("Paypal").build(),
                        Projects.builder().name("HDFC_Alpha").clientName("HDFC").build()))
                .build();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        return employeeList;
    }
}
