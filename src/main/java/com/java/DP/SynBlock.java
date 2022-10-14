package com.java.DP;

public class SynBlock {
   private static SynBlock syncBlock=null;


   private SynBlock(){

   }

   public static SynBlock getInstance(){

       if(syncBlock==null){

           synchronized(SynBlock.class){
               if(syncBlock==null){
                   syncBlock= new SynBlock();
               }
           }

       }
       return syncBlock;
   }

}
