package books.java_programming.chapter_04.practice;

public class WhatOutput {
    public static void main(String []args){
        int a = 100,x = 4, y = 11;

        if(x > y){
            a = 21;
            x = x++;
        }

        System.out.println(a);
    }
}

/*
Output : 
100
*/