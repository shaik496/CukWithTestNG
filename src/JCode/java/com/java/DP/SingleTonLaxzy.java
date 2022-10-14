package com.java.DP;

public class SingleTonLaxzy {

    private static SingleTonLaxzy singleTonLaxzy;

    private SingleTonLaxzy() {
        //
    }


    public static SingleTonLaxzy getSingleTonLaxzy() {
        if (singleTonLaxzy == null) {
            singleTonLaxzy = new SingleTonLaxzy();
        }
        return singleTonLaxzy;
    }
}
