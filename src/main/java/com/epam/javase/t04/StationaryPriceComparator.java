package com.epam.javase.t04;

import com.epam.javase.t03.Stationary;

import java.util.Comparator;

/**
 * Created by Olya Lee on 16.10.2016.
 */

public class StationaryPriceComparator implements Comparator <Stationary>{

//    public int compare(Stationary s1, Stationary s2){
//        return Integer.compare(s1.getPrice(),s2.getPrice());
//    }

//public class StationaryPriceComparator implements Comparator{

    @Override
    public int compare(Stationary s1, Stationary s2) {
        double priceS1 = s1.getPrice();
        double priceS2 = s2.getPrice();
        if(priceS1<priceS2) {
            return -1;
        }
        else if(priceS1==priceS2) {
            return 0;
        }
        else {
            return 1;
        }

    }

    @Override
    public Comparator<Stationary> reversed() {
        return null;
    }
}
