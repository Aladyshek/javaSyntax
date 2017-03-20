package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> massiv = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            massiv.add(i, reader.readLine());
        }

        for (int i = 1; i < massiv.size();) {
            if (massiv.get(i).length()< massiv.get(i-1).length())
            {
                System.out.println(i);
                break;
            }
            else
            {
                i++;

            }
        }
    }
}

