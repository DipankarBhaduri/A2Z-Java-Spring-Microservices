package com.spring.gson_and_json.utils;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonForGson {
    private String name;
    private int age;
    List<String> phoneNumber;
}
