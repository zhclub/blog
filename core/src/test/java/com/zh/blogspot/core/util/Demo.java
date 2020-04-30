package com.zh.blogspot.core.util;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4, 5, 6};

        List<Integer> list = new ArrayList<>(Arrays.asList(a));


        Integer[] integers = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(integers));


    }

}
