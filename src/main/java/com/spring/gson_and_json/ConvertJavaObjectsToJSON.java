package com.spring.gson_and_json;

import com.google.gson.Gson;
import com.spring.gson_and_json.utils.PersonForGson;
import java.util.Arrays;

public class ConvertJavaObjectsToJSON {
    public static void main(String[] args) {
        Gson gson = new Gson();
        PersonForGson personForGson = new PersonForGson("Dipankar", 27, Arrays.asList("8100003959", "7003574750"));
        String jsonString = gson.toJson(personForGson);
        System.out.println(jsonString);

        PersonForGson person2 = personForGson;

        person2.setName("Pritam");

        System.out.println(personForGson.getName());
        System.out.println(person2.getName());
    }
}
