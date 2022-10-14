package com.java.DP;

public class SingTon {

   private static  SingTon singTon= new SingTon();

    private SingTon(){
        //
    }


    public static SingTon getInstance(){
        return singTon;
    }

}
