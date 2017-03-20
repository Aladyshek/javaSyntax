package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Самые-самые
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> massiv = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
           massiv.add(i, reader.readLine());
        }
        int min = massiv.get(0).length();
        int max = massiv.get(0).length();
        for (int i = 1; i < massiv.size(); i++) {

            if (massiv.get(i).length()> max)
            {
                max = massiv.get(i).length();
            }
            if (massiv.get(i).length()<min)
            {
                min = massiv.get(i).length();
            }
        }
        for (int i = 0; i < massiv.size();) {
            if(massiv.get(i).length() == min) {
                System.out.println(massiv.get(i));
                break;
            }
            else if (massiv.get(i).length() == max)
                {
                    System.out.println(massiv.get(i));
                    break;
            }
            else i++;
        }


    }
}
