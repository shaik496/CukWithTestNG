package com.java.eightfeatures;

import org.bouncycastle.math.ec.PreCompInfo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExamples {

  /*
  abstract method test
  public abstract boolean test();
  */


    public static void main(String[] args) {
        Predicate<String> pobj = (data) -> {
            boolean svl = false;
            if (data.length() > 10) {
                System.out.println("Fuck of meeravali you are locked hear");
                return true;
            }
            return svl = true;
        };

        System.out.println(pobj.test("Is Ramisa is chutiya"));


        // some exmp
        Predicate<String> tj = (data) -> {
            if (data.length() > 4) {
                System.out.println("Wow you are eligible for this post because u have name " + data);
            }
            return true;
        };
        String arr[] = {"john", "Ran", "Mahesh", "jhes", "Ravi and fuck gang"};
        for (String jok :
                arr) {
            tj.test(jok);
        }


        Integer uu[] = {400, 200, -199, 4834, -10};

        Predicate<Integer> p1 = (inpu) -> (inpu > 10);

        Predicate<Integer> p2 = (inpu) -> (inpu > 100);




        for (Integer tdata:
             uu) {
            if(p1.or(p2).test(tdata)){
                System.out.println(" Just fuck of be ");
            }
        }


    }

}
