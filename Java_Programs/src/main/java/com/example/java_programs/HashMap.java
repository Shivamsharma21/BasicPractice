package com.example.java_programs;

import java.util.Map;
import java.util.Set;

public class HashMap {

    public static void main(String []args){

        Map<String,Integer> users = new java.util.HashMap<String,Integer>();


        users.put("Shivam",939029);
        users.put("Stefen",657777);
        users.put("Carolin",213333);
        users.put("Jim",989877);
        users.put("Fread",433454);

        System.out.println(users.get("Shivam"));

        ////   for getting all the keys of map

        Set<String> keys = users.keySet();

        for (String s : keys){
            System.out.println(s +" : "+users.get(s));
        }
        
    }

}
