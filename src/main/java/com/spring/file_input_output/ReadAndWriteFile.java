package com.spring.file_input_output;

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Self-Progress\\A2Z-Java-Spring-Microservices\\target\\generated.txt";

        // File write as a text
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        for (int i = 1; i <= 10; i++) {
            bufferedWriter.write(10+" X "+i+ " = "+10*i);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();

        // File read as a text
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String value;
        while ((value = bufferedReader.readLine()) != null) {
            System.out.println(value);
        }
        bufferedReader.close();
    }
}
