package com.spring.java_8_stream_api.practice_problems;

import com.spring.java_8_stream_api.practice_problems.utils.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Group a List of objects by a specific property using Streams.
 */
public class ObjectToMapCreate {
    public static void main(String[] args) {
        Employee pritam = new Employee("Pritam", 26);
        Employee dipankar = new Employee("Dipankar", 36);
        Employee ajay = new Employee("Ajay", 46);

        List<Employee> employeeList = Arrays.asList(pritam, dipankar, ajay);
        Map<Integer, String> ageNameMap = convertAgeNameMap (employeeList);
        ageNameMap.entrySet().forEach(k -> {System.out.println(k.getKey()+", "+k.getValue());});
    }

    private static Map<Integer, String> convertAgeNameMap(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.toMap(Employee::getAge, employee -> employee.getName()));
    }
}
