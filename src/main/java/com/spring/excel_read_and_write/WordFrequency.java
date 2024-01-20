package com.spring.excel_read_and_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        try {
            String path = "D:\\Self-Progress\\A2Z-Java-Spring-Microservices\\target\\generated.txt";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String value = new String();
            String temp = null;
            while((temp = bufferedReader.readLine()) != null) {
                value += temp;
            }

            Map<String, Integer> map = new HashMap<>();
            temp = new String();

            for (int i = 0; i < value.length(); i++) {
                char ch = value.charAt(i);
                if ((ch == '.' || ch == ',' || ch == ' ') && !temp.isEmpty()) {
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + 1);
                    } else {
                        map.put(temp, 1);
                    }
                    temp = new String();
                } else {
                    if (ch != ' ') {
                        temp += ch;
                    }
                }
            }

            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey()+" - "+entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
