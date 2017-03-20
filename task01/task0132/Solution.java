package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String b = number+"";
       char[] a = b.toCharArray();

        int sum = 0;
        for (int i = 0; i < a.length; i++) {


            sum = sum + Integer.parseInt(a[i]+"");

        }
        return sum;
    }
}