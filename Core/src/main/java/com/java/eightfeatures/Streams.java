package com.java.eightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    // used to process the collections


    // based up on the condition based on the contions filter will store the data in other colletion

    // Map will used to perfrom some opraiton adn store data into other map or collection objects


    public static void main(String[] args) {
        // filters
        List<Integer> inarr = new ArrayList<Integer>();
        inarr.add(20);
        inarr.add(90);
        inarr.add(77);
        inarr.add(30);
        inarr.add(11);
        List<Integer> evelist = new ArrayList<>();

        evelist = inarr.stream().filter((val) -> (val % 2 == 0)).collect(Collectors.toList());
        // System.out.println(evelist);
        inarr.stream().filter((val) -> (val % 2 == 0)).forEach(System.out::println);


        // filter with multiple names
        List<String> mul = new ArrayList<>();

        mul.add("Shaik Meeravali");

        mul.add("Vamshi");
        mul.add("kumar");
        mul.stream().filter((name) -> name.length() > 4 && name.equals("kumar")).forEach(System.out::println);


    }
}
