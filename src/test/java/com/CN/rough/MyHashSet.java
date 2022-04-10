package com.CN.rough;

import java.util.ArrayList;
import java.util.List;

class MyHashSet {

    final int TOTAL_BUCKETS = 769; //prime number for almost even distribution across
    List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[TOTAL_BUCKETS];

        for(int index = 0; index < TOTAL_BUCKETS; ++index)
            buckets[index] = new ArrayList<Integer>();
    }

    public void add(int key) {
        if(contains(key))
            return;

        int hashIndex = hashCode(key);
        buckets[hashIndex].add(key);
    }

    public void remove(int key) {
        int hashIndex = hashCode(key);
        List<Integer> theRightBucket = buckets[hashIndex];

        if(theRightBucket.size() == 0)
            return;

        for(int index = 0; index < theRightBucket.size(); ++index) {
            if(theRightBucket.get(index) == key)
                theRightBucket.remove(index);
        }
    }

    public boolean contains(int key) {
        int hashIndex = hashCode(key);
        List<Integer> theRightBucket = buckets[hashIndex];

        if(theRightBucket.size() == 0)
            return false;

        for(Integer slot: theRightBucket)
            if(slot == key)
                return true;

        return false;
    }

    private int hashCode(int key) {
        return key % TOTAL_BUCKETS;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */