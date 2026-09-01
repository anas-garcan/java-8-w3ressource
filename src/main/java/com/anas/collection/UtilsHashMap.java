package com.anas.collection;

import java.util.HashMap;
import java.util.Map;

public class UtilsHashMap {
    public static Map<Integer, String> associateKeyValueInHashMap(Map<Integer, String> map, Integer key, String value) {
        map.put(key, value);
        return map;
    }


    public static int countKeyValue(Map<Integer, String> map) {
        return map.size();
    }


    public static Map<Integer, String> copyMapForAnother(Map<Integer, String> sourceMap, Map<Integer, String> destinationMap) {
        return destinationMap = new HashMap<>(sourceMap);
    }


    public static Map<Integer, String> removeAllMapping(Map<Integer, String> map) {
        map.clear();
        return map;
    }


    public static Boolean checkIfMapIsEmpty(Map<Integer, String> map) {
        if (map.isEmpty()) {
            System.out.println("Map is Empty");
            return true;
        } else {
            System.out.println("Map is not Empty");
            return false;
        }
    }


    public static Map<Integer, String> shallowCopyOfMap(Map<Integer, String> mapSource, Map<Integer, String> mapDestination) {
        return mapDestination = (Map<Integer, String>) new HashMap<>(mapSource);
    }


    public static void IfKeyExistsInMap(Map<Integer, String> map, Integer key) {
        if (map.containsKey(key))
            System.out.println("HashMap Contains key  :  " + key);
        else
            System.out.println("HashMap doesn't Contains key : " + key);
    }


    public static void IfValueExistsInMap(Map<Integer, String> map, String value) {
        if (map.containsValue(value))
            System.out.println("HashMap Contains Value :   " + value);
        else
            System.out.println("HashMap doesn't Contains Value :   " + value);
    }


    public static void GetSetViewEntries(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> s : map.entrySet()) {
            System.out.println("View Entrie " + s);
        }
    }


    public static String getValueByKey(Map<Integer, String> map, Integer key) {
        return
                (map.containsKey(key)) ? map.get(key) : "Value Not exist";
    }


    public static void getSetKeyMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> k : map.entrySet()) {
            System.out.println("Key : " + k.getKey());
        }
    }


    public static void getValueOfMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> v : map.entrySet()) {
            System.out.println("Value : " + v.getValue());
        }
    }
}
