package com.hope.thinks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapUtils {
    private static final HashMap<String ,List<HashMap<String,String>>> hashMap = new HashMap<>();

    private static final List<HashMap<String,String>> listMap = new ArrayList<>();

    private static final HashMap<String,String> hash = new HashMap<>();
    public static void main(String[] args) {
        hash.put("1","1养老险");
        hash.put("2","2养老险");
        hash.put("3","3养老险");
        hash.put("4","4养老险");
        hash.put("5","5养老险");hash.put("6","6养老险");hash.put("7","7养老险");


        listMap.add(hash);
        hashMap.put("RenShe",listMap);

        String a = "RenShe";

        hashMap.get("RenShe").get(0).get("2");
        System.out.println((hashMap.get("RenShe").get(0).get("2")));

//        if(a.equals(hashMap.get("RenShe"))){
//
//        }
    }
}
