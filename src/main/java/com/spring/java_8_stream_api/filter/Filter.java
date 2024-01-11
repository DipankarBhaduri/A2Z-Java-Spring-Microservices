package com.spring.java_8_stream_api.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<String> nameList = new ArrayList<>();

        while (totalNumber != 0) {
            nameList.add(scanner.next());
            totalNumber--;
        }

        List<String> filteredList = getFilteredList(nameList);
        filteredList.stream().forEach(System.out::println);
    }

    private static List<String> getFilteredList(List<String> nameList) {
        if (nameList != null && !nameList.isEmpty()) {
            return nameList.stream().filter(name -> name.toLowerCase().charAt(0) == 'a').toList();
        }
        return new ArrayList<>();
    }
}
