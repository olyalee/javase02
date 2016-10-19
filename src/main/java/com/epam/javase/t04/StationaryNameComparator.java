package com.epam.javase.t04;

import com.epam.javase.t03.Stationary;

import java.util.Comparator;

/**
 * Created by Olya Lee on 16.10.2016.
 */

public class StationaryNameComparator implements Comparator<Stationary> {

    @Override
    public int compare(Stationary s1, Stationary s2) {

          return s1.getName().compareToIgnoreCase(s2.getName());
    }
}