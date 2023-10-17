package session14.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String,Integer> myMap = initialiseMap();

        int retrievedValue = retrieveValue(myMap,"two");
        System.out.println(retrievedValue);

        updateMap(myMap,"one",11);
        System.out.println(myMap.get("one"));
    }

    private static void updateMap(Map<String,Integer> map, String key, int value){
        map.put(key,value);
    }

    private static int retrieveValue (Map<String,Integer> map, String key){
        return map.get(key);
    }

    private static Map<String,Integer> initialiseMap(){
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        return map;
    }
}
