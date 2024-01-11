package com.spring.java_8_stream_api.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of input : ");

        int totalNumber = scanner.nextInt();
        List<String> nameList = new ArrayList<>();

        while (totalNumber != 0) {
            nameList.add(scanner.next());
            totalNumber--;
        }

        List<String> convertedNames = getInUpperCase(nameList);
        convertedNames.stream().forEach(System.out::println);
    }

    private static List<String> getInUpperCase(List<String> nameList) {
        if (nameList != null && !nameList.isEmpty()) {
            return nameList.stream().map(name -> name.toUpperCase()).toList();
        }
        return new ArrayList<>();
    }
}
