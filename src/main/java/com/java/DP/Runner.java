package com.java.DP;

public class Runner {


    public static void main(String[] args) {

      /* SingleTonLaxzy singleTonLaxzy =SingleTonLaxzy.getSingleTonLaxzy();
        System.out.println(singleTonLaxzy);
        SingleTonLaxzy singleTonLaxzy2 =SingleTonLaxzy.getSingleTonLaxzy();
        System.out.println(singleTonLaxzy2);*/


    SynchromizedSingleTon sn=    SynchromizedSingleTon.getSynchromizedSingleTon();
        System.out.println(sn);
        SynchromizedSingleTon sbb2=    SynchromizedSingleTon.getSynchromizedSingleTon();
        System.out.println(sbb2);

    }

}
