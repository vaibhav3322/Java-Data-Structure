package Java_8_scenario_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Ramu Naidu", 32, "Male", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Ravi Kumar", 25, "Male", "Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Laxman Reddy", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Hanu Prasad", 43, "Male", "Finance", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account", 2010, 27000.0));
        employeeList.add(new Employee(188, "Raju Verma", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Lakshmi Priya", 24, "Female", "Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jagan Mohan", 38, "Male", "Finance", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account", 2013, 21300.0));
        employeeList.add(new Employee(244, "Ramesh Babu", 24, "Male", "Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Development", 2012, 35700.0));

        // Q.1 Find out the count of male and female employees

        Map<String,Long> countss = employeeList.stream().collect(Collectors.groupingBy(
                Employee::getGender, Collectors.counting()
        ));
        System.out.println(countss);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Q2. Print the names of all departments in the organization.

        List<String> names = employeeList.stream().map(Employee::getDepartment).toList();
        System.out.println("Departments names -> " + names);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Q3. Print the names of all departments unique & sorted.

        List<String> sortDepartments = employeeList.stream().map(Employee::getDepartment).distinct().sorted().toList();
        System.out.println("Departments names sorted -> " + sortDepartments);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Q4. Find the average age of Male and Female employees.

        Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age by Sex");
        System.out.println(avgAge);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Q5. Count the number of employees in each department.
        Map<String, Long> countEmpByDepartment = employeeList.
                 stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Count of Employees by department ->");
        System.out.println(countEmpByDepartment);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
