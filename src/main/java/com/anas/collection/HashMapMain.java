package com.anas.collection;

import java.util.Map;

public class HashMapMain {
    static void main() {
          /*System.out.println("----------------------------------------------1. Associate Key with Value in HashMap------------------------------------------------");
        Map<Integer, String> map = new HashMap<>();

        UtilsHashMap.associateKeyValueInHashMap(map,1,"Java");
        UtilsHashMap.associateKeyValueInHashMap(map,2,"Angular");
        UtilsHashMap.associateKeyValueInHashMap(map,3,"React");
        UtilsHashMap.associateKeyValueInHashMap(map,4,"C#");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Clé : " + entry.getKey());
            System.out.println("Valeur : " + entry.getValue());
        }*/


       /* System.out.println("----------------------------------------------2. Count Key-Value Mappings in Map------------------------------------------------");
        Map<Integer,String> mapForCountKeyValue = new HashMap<>();
        mapForCountKeyValue.put(1,"Hello");
        mapForCountKeyValue.put(2,"Hi");
        mapForCountKeyValue.put(3,"How are you");
        System.out.println("Count of Key-Value :    \n"+UtilsHashMap.countKeyValue(mapForCountKeyValue));*/

      /*  System.out.println("----------------------------------------------3. Copy Mappings to Another Map------------------------------------------------");
        Map<Integer,String> sourceMap = new HashMap<>();
        sourceMap.put(7,"Audi");
        sourceMap.put(9,"Toyota");
        sourceMap.put(10,"Bmw");
        sourceMap.put(78,"VW");
        Map<Integer,String> destinationMap = new HashMap<>();

        System.out.println("Copy  "+UtilsHashMap.copyMapForAnother(sourceMap,destinationMap)); */

        /*System.out.println("----------------------------------------------4. Remove All Mappings from Map------------------------------------------------");
        Map<Integer,String> mapForRemoveAllMapping = new HashMap<>();
        mapForRemoveAllMapping.put(7,"Hahah");
        mapForRemoveAllMapping.put(78,"Hello");
        mapForRemoveAllMapping.put(45,"Wash a khuna");
        System.out.println("Remove All Mappings from Map     "+UtilsHashMap.removeAllMapping(mapForRemoveAllMapping));*/

      /*  System.out.println("----------------------------------------------5. Check If Map is Empty------------------------------------------------");
        Map<Integer,String> mapCheckIfMapIsEmpty = new HashMap<>();
        System.out.println("If map empty :     \n"+UtilsHashMap.checkIfMapIsEmpty(mapCheckIfMapIsEmpty));
        mapCheckIfMapIsEmpty.put(5,"You");
        mapCheckIfMapIsEmpty.put(8,"Engine");
        mapCheckIfMapIsEmpty.put(7,"FootBall");
        System.out.println("If map empty :     \n"+UtilsHashMap.checkIfMapIsEmpty(mapCheckIfMapIsEmpty));*/

        /*System.out.println("----------------------------------------------6. Get Shallow Copy of HashMap------------------------------------------------");
        Map<Integer,String> mapSource = new HashMap<>();
        mapSource.put(1,"Germany");
        mapSource.put(2,"French");
        mapSource.put(3,"UK");
        mapSource.put(4,"Japan");
        mapSource.put(5,"US");
        Map<Integer,String> mapDestination = new HashMap<>();
        System.out.println("Get Shallow Copy of HashMap   "+UtilsHashMap.shallowCopyOfMap(mapSource,mapDestination));*/

        /*System.out.println("----------------------------------------------7. Check If Key Exists in Map------------------------------------------------");
        Map<Integer,String> mapForIfKeyExistsInMap = new HashMap<>();
        mapForIfKeyExistsInMap.put(7,"Hello");
        mapForIfKeyExistsInMap.put(5,"Hi");
        System.out.println("Check If Key Exists in Map : ");
        UtilsHashMap.IfKeyExistsInMap(mapForIfKeyExistsInMap,7);
        UtilsHashMap.IfKeyExistsInMap(mapForIfKeyExistsInMap,14);*/

      /*  System.out.println("----------------------------------------------8. Check If Value Exists in Map------------------------------------------------");
       Map<Integer,String> mapIfValueExistsInMap = new HashMap<>();
       mapIfValueExistsInMap.put(1,"d4d");
       mapIfValueExistsInMap.put(2,"Tdi");
       mapIfValueExistsInMap.put(3,"dci");
        System.out.println("Check If Value Exists in Map  ");
        UtilsHashMap.IfValueExistsInMap(mapIfValueExistsInMap,"d4d");
        UtilsHashMap.IfValueExistsInMap(mapIfValueExistsInMap,"Crdi");*/

        /*System.out.println("----------------------------------------------9. Get Set View of Map Entries------------------------------------------------");
        Map<Integer,String> mapGetSetViewEntries = Map.of(1,"d4d",2,"Tdi",3,"dci",4,"Germany",5,"US");
        System.out.println("Get Set View of Map Entries  \n");
        UtilsHashMap.GetSetViewEntries(mapGetSetViewEntries);*/

        /*System.out.println("----------------------------------------------10. Get Value by Key from Map------------------------------------------------");
        Map<Integer,String> mapGetValueByKey = Map.of(1,"d4d",2,"Tdi",3,"dci",4,"Germany",5,"US");

        System.out.println("Get Value by Key from Map :  \n"+UtilsHashMap.getValueByKey(mapGetValueByKey,2));
        System.out.println("Get Value by Key from Map if exist :  \n"+UtilsHashMap.getValueByKey(mapGetValueByKey,55));*/

      /*  System.out.println("----------------------------------------------11. Get Set of Keys from Map------------------------------------------------");
        Map<Integer,String> mapGetSetKeyMap = Map.of(1,"d4d",2,"Tdi",3,"dci",4,"Germany",5,"US");
        System.out.println("Get Set of Keys from Map  ");
        UtilsHashMap.getSetKeyMap(mapGetSetKeyMap);*/

        System.out.println("----------------------------------------------12. Get Collection of Values from Map------------------------------------------------");
        Map<Integer,String> mapGetValueOfMap = Map.of(1,"d4d",2,"Tdi",3,"dci",4,"Germany",5,"US");
        System.out.println("Get Collection of Values from Map  ");
        UtilsHashMap.getValueOfMap(mapGetValueOfMap);
    }
}
