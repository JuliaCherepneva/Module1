package com.gridnine;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map);
        System.out.println(map.get(3));
        map.remove(3);
        System.out.println(map.get(3));
    }
}
