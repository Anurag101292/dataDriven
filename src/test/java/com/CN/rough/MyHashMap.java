package com.CN.rough;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    int size_of_bucket = 8;
    LinkedList<Node>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[size_of_bucket];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int getHash(K key) {
        int indices = key.hashCode();
        return Math.abs(indices) % buckets.length;
    }

    public void put(K key, V value) {
        int bucket_index = getHash(key);

        for (Node N : this.buckets[bucket_index]) {
            if (N.key.equals(key)) {
                N.value = value;
                return;
            }
        }
        this.buckets[bucket_index].add(new Node(key, value));
    }

    public void remove(K key) {
        int indices = getHash(key);
        for (Node n : buckets[indices]) {
            if (n.key.equals(key)) {
                buckets[indices].remove(n);
            }
        }
    }

    public V get(K key) {
        int indices = getHash(key);
        for (Node n : this.buckets[indices]) {
            if (n.key.equals(key)) {
                return n.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Anurag", 1);
        map.put("Akhil", 2);
        map.put("Anurag",3);
//        System.out.println(map.buckets[map.getHash("Anurag")]);

        System.out.println(map.get("Anurag"));
    }
}
