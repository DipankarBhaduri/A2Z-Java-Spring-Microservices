package com.spring.annotation_creation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DogForAnnotationCreation {
    private String name;
    private int age;

    @TotalRuntime(times = 5)
    public void eat() {
        System.out.println("Dog love to eat meat!");
    }
}
