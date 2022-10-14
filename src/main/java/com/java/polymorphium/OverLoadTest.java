package com.java.polymorphium;

import java.util.SortedMap;

public class OverLoadTest {


    void show(Object a){
        System.out.println("this int show function");
    }

    void show(String data){
        System.out.println("This is String method");
    }

    void show(StringBuffer data){
        System.out.println("This is StringBuffer method");
    }
    void show(Character data){
        System.out.println("This is Character method");
    }


    void show(int...data){
        System.out.println("Varargs methood");
    }

    public static void main(String[] args) {

        OverLoadTest overLoadTest= new OverLoadTest();
        overLoadTest.show("this ");

        overLoadTest.show(new StringBuffer("call"));
        overLoadTest.show("");
    }
}
