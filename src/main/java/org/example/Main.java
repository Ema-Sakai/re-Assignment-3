package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cats = new HashMap<>();

        cats.put("Nyanta", "Abyssinian");
        cats.put("Sasami", "American Shorthair");
        cats.put("Jyarashi", "Persian");
        cats.put("Buchi", "Siamese");
        cats.put("Mokomoko", "British Shorthair");

        cats.forEach((name, type) -> System.out.println(name + "'s breed of cat is an " + type + "."));

        String searchKey = "Poyopoyo-chan";
        String breed = cats.get(searchKey);

        if (breed != null) {
            System.out.println(searchKey + "'s breed of cat is an " + breed + ".");
        } else {
            System.out.println("That kitty was not found.");
        }
    }
}
