package com.spring.excel_read_and_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Create a program that reads a text file and counts the number of occurrences of each character.
 * Display the result in the console.
 */
public class CharacterCount {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Self-Progress\\A2Z-Java-Spring-Microservices\\target\\generated.txt";
        Map<Character, Integer> characterCount = new HashMap<>();
        String stringValue = new String();
        String temp = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while ((temp = bufferedReader.readLine()) != null) {
            stringValue += temp;
        }

        for (int i = 0; i < stringValue.length(); i++) {
            char ch = stringValue.charAt(i);
            if (characterCount.containsKey(ch)) {
                characterCount.put(ch, characterCount.get(ch) + 1);
            } else {
                characterCount.put(ch, 1);
            }
        }

        int totalChar = 0;
        for(Map.Entry<Character, Integer> stringIntegerEntry : characterCount.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+" - "+stringIntegerEntry.getValue());
            totalChar += stringIntegerEntry.getValue();
        }
        System.out.println("Total Character : "+totalChar);
    }
}
