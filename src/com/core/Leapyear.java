package com.core;

public class Leapyear {
public static void main(String[] args){
    // year to be checked
    int year = 1900;
    boolean leap = false;


    if (year % 4 == 0) {


            if (year % 100 == 0) {

            if (year % 400 == 0)
            leap = true;
            else
            leap = false;
            }

            // if the year is not century
            else
            leap = true;
            }

            else
            leap = false;

            if (leap)
            System.out.println(year + " is a leap year.");
            else
            System.out.println(year + " is not a leap year.");
            }
            }



