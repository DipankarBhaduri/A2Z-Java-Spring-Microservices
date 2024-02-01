package com.spring.gson_and_json.utils;

import com.google.gson.Gson;

public class ConvertJSONToJavaObjects {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonString = "{\"name\":\"Dipankar\",\"age\":27,\"phoneNumber\":[\"8100003959\",\"7003574750\"]}";
        PersonForGson person = gson.fromJson(jsonString, PersonForGson.class);
        System.out.println(person);
    }
}
