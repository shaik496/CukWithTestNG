package com.java.polymorphium;


import java.util.*;

public class C1 {



    public static void main(String[] args) {
        C1 c= new C1();
        c.m1();
    }

    public void m1() {
        // Find duplicate charactrs in staing
        String name = " test one two three and four";


        char cher[] = name.toCharArray();


        Set<Character> ch = new HashSet<>();


        for (Character c :
                cher) {
            if (ch.add(c)){

            }else{
                System.out.println("Given didit is Duplicate "+ c);
            }
        }

    }







}
