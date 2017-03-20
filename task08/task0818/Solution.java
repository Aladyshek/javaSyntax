package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> zp = new HashMap<String, Integer>();
        zp.put("Ivanov", 399);
        zp.put("Ivanov1", 499);
        zp.put("Ivanov2", 599);
        zp.put("Ivanov3", 699);
        zp.put("Ivanov4", 799);
        zp.put("Ivanov5", 899);
        zp.put("Ivanov6", 999);
        zp.put("Ivanov7", 199);
        zp.put("Ivanov8", 299);
        zp.put("Ivanov9", 1199);


        return zp;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> lolololo =new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : lolololo.entrySet()) {
        if (pair.getValue()<500)
        {
            map.remove(pair.getKey());
        }

        }

    }
    public static void main(String[] args) {


    }
}