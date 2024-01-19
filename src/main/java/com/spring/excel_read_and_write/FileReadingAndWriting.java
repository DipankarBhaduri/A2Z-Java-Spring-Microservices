package com.spring.excel_read_and_write;

import java.io.*;

public class FileReadingAndWriting {
    /**
     * Write a Java program to read the contents of a text file and
     *                 write them into another file
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String path1 = "D:\\Self-Progress\\A2Z-Java-Spring-Microservices\\target\\generated.txt";
        String path2 = "D:\\Self-Progress\\A2Z-Java-Spring-Microservices\\target\\FileReadingAndWriting.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));
        String value;

        while ((value = bufferedReader.readLine()) != null) {
            bufferedWriter.write(value+"\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
