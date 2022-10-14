package com.java.DP;

public class SynchromizedSingleTon {

   private static SynchromizedSingleTon synchromizedSingleTon=null;
   private SynchromizedSingleTon(){

   }
   public static synchronized SynchromizedSingleTon getSynchromizedSingleTon(){

       if(synchromizedSingleTon==null){
           synchromizedSingleTon= new SynchromizedSingleTon();
       }
       return synchromizedSingleTon;
   }
}
