package com.anthony;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5){
            myDoubleValues.add(dbl);
        }

        for(int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + "  --> " + value);
        }
    }


}
