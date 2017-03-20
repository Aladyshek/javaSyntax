package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> massiv = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            massiv.add(i, Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> max = new ArrayList<Integer>();

        int index = 0;

        for (int i = 0; i < massiv.size()-1; i++) {
        if (massiv.get(i) == massiv.get(i+1))
        {
           try {
               max.set(index, max.get(index)+1);
           }
           catch (Exception e)
           {
               max.add(index, 2);
           }
        }
        else {
            try {
                max.set(index, max.get(index));
            }
            catch (Exception e)
            {
                max.add(index, 1);
            }
            index++;
        }
        }
        int maximum = 1;
        for (int i = 0; i < max.size(); i++) {
            if (max.get(i)> maximum)
            {
                maximum = max.get(i);
            }
        }
        System.out.println(maximum);



    }
}
