package com.core;

public class Swapping {

    public static void main(String[] args) {

        float first = 2.3f, second = 7.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);


        float temporary = first;

        first = second;
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}