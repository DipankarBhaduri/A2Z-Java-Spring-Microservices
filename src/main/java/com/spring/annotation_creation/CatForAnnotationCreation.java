package com.spring.annotation_creation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@VeryImportant()
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CatForAnnotationCreation {
    private String name;
    private int age;
}
