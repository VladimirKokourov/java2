package ru.geekbrains.homework.lesson3;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "red", "bad", "cat", "dog", "cat", "sad", "mad", "dad", "pit", "set", "red"};
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String x : words) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hashMap);

        Phone phBook = new Phone();
        phBook.add("Кузнецов", "89456523132");
        phBook.add("Якушев", "89459842153");
        phBook.add("Морозов", "89455122132");
        phBook.add("Петров", "89135558889");
        phBook.add("Прокофьев", "89235689781");
        phBook.add("Воробьев", "89159882221");
        phBook.add("Дидков", "89416548877");
        phBook.add("Кузнецов", "89894561133");

        System.out.println("Тел: " + phBook.get("Кузнецов"));
        System.out.println("Тел: " + phBook.get("Петров"));
    }
}
