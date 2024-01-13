package com.spring.generics_in_java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ObjectToMapConversion {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Tuhin", 26);
        Student student2 = new Student("Rajib", 28);
        studentList.add(student1);
        studentList.add(student2);

        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher1 = new Teacher("Arjo", 26);
        Teacher teacher2 = new Teacher("Bratoti", 28);
        teacherList.add(teacher2);
        teacherList.add(teacher1);

        Map<String, Student> stringStudentMap = getPbjectMap(studentList, Student::getName);
        Map<String, Teacher> stringTeacherMap = getPbjectMap(teacherList, Teacher::getName);

        stringStudentMap.entrySet().forEach((stud) -> System.out.println(stud.getKey()+"--"+stud.getValue()));
        stringTeacherMap.entrySet().forEach((stud) -> System.out.println(stud.getKey()+"--"+stud.getValue()));
    }
    public static <T, R> Map<R, T> getPbjectMap(List<T> list, Function<T, R> keyExtractor) {
        return list.stream().collect(Collectors.toMap(keyExtractor, Function.identity()));
    }
}

@Getter
@Setter
@AllArgsConstructor
class Student {
    private String name;
    private int age;
}

@Getter
@Setter
@AllArgsConstructor
class Teacher {
    private String name;
    private int age;
}