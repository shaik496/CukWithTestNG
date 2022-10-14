package com.java.polymorphium;

import org.asynchttpclient.Param;

import java.io.IOException;

public class OverRide extends ParentClass {


    public void test1 () {
        System.out.println("this is override child  class");
    }
    public static void main(String[] args) {

        OverRide overRide = new OverRide();

        overRide.test1();

    }


}
