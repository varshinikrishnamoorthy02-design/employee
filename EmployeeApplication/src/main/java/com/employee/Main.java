
package com.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService employeeService =
                context.getBean(EmployeeService.class);

        employeeService.addEmployee();

        employeeService.displayEmployee();

        employeeService.calculateSalary();

        context.close();
    }
}
