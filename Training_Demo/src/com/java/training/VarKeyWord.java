package com.java.training;

import java.util.HashMap;

public class VarKeyWord {

//    var global = 1;

    public static void main(String[] args) {
        String name1 = "john";
        int age1 = 25;

        CollectorsAPI collectorsAPI = new CollectorsAPI();
        var  collect = new CollectorsAPI();

        System.out.println(collect);

        var name2 = "ana";
        var age2 = 20;

//        var pin = null;

        var map = new HashMap<String, Integer>();

        age1 =30;
        age2 = 30;

        System.out.println(age1);
        System.out.println(age2);
    }

//    private var add(var a){
//        return a;
//    }
}
