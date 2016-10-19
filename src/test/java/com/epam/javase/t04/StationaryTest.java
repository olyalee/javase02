package com.epam.javase.t04;

import com.epam.javase.t03.RookieKit;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Olya Lee on 16.10.2016.
 */
public class StationaryTest {
    @Test
    public void compare(){
        StationaryNameComparator comparatorByName = new StationaryNameComparator();
        StationaryPriceComparator comparatorByPrice = new StationaryPriceComparator();
        RookieKit rookieKit = new RookieKit();

        Collections.sort(rookieKit.getStationary());


//        for (Stationary s: rookieKit.getStationary()){
//            System.out.println(rookieKit.getStationary().toString());
//        }

//        Arrays.sort(rookieKit.getStationary());

//        Arrays.sort(rookieKit.getStationary(),comparatorByPrice);
        for (Object s: rookieKit.getStationary()){
            System.out.println(s);
        }

        System.out.println();

//        rookieKit.getStationary().


    }
}
