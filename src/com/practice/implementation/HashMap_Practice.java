package com.practice.implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMap_Practice {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<String,Integer>();
        map.put("India",150);
        map.put("China",145);
        map.put("Pakistan",30);
        map.put("Nepal",2);
        map.put("Srilanka",10);

        //To Check Whether The key is present or not
//        System.out.println(map.containsKey("India"));
//        System.out.println(map.containsKey("USA"));

        //get
        System.out.println(map.get("Nepal"));
        //Traversing on keys
        for(String key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }

        //size of the map
        System.out.println(map.size());

        //Removal From HashMap

       for(String key2:map.keySet()){

           System.out.println(map.remove(key2));

       }
    }
}
