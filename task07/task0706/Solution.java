package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int countCh =0;
        int countNeCh = 0;

        int[] massivchik = new int[15];
        for (int i = 0; i <massivchik.length; i++) {
            int schit = Integer.parseInt(reader.readLine());
          massivchik[i]=schit;
            if (i %2==0)
            {
                countCh += schit;
            }
            else countNeCh += schit;
        }


        System.out.println((countCh > countNeCh) ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");


    }
}
