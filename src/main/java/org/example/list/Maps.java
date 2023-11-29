package org.example.list;

import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main (String[] args) {
        Map<String, String> favoriteSubject = new HashMap<>();

        favoriteSubject.put("Timeon", "F");
        favoriteSubject.put("Juan", "G");
        favoriteSubject.put("Silvan", "B");

        favoriteSubject.remove("Silvan", "Math");

        System.out.println(favoriteSubject.get("Juan"));
    }
}
