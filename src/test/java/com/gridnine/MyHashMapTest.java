package com.gridnine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MyHashMapTest {
    @Test
    void testPutAndGet() {
        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("name", "Alice");
        assertEquals("Alice", map.get("name"));

        map.put("name", "Bob");
        assertEquals("Bob", map.get("name"));
    }

    @Test
    void testRemove() {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(1, "one");
        map.put(2, "two");

        map.remove(1);
        assertNull(map.get(1));
        assertEquals("two", map.get(2));
    }

    @Test
    void testNullKey() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put(null, 100);
        assertEquals(100, map.get(null));

        map.remove(null);
        assertNull(map.get(null));
    }

    @Test
    void testResize() {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, "val" + i);
        }
        for (int i = 0; i < 100; i++) {
            assertEquals("val" + i, map.get(i));
        }
    }
}