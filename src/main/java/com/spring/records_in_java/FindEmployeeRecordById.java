package com.spring.records_in_java;

import java.util.ArrayList;
import java.util.List;

public class FindEmployeeRecordById {
    public static void main(String[] args) {
        List<EmployeeRecord> employeeRecordList = new ArrayList<>();
        employeeRecordList.add(new EmployeeRecord(1, "Dipankar", 5000));
        employeeRecordList.add(new EmployeeRecord(2, "Dipankar", 5000));
        employeeRecordList.add(new EmployeeRecord(3, "Dipankar", 5000));
        employeeRecordList.add(new EmployeeRecord(4, "Dipankar", 5000));

        EmployeeRecord employeeRecord = employeeRecordList
                .stream().filter(employeeRecord1 -> employeeRecord1.id() == 2)
                .findFirst().get();
        System.out.println(employeeRecord.toString());
    }
}
