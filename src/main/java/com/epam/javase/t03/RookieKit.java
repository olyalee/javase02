package com.epam.javase.t03;

import com.epam.javase.t04.StationaryNameComparator;
import com.epam.javase.t04.StationaryPriceComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Olya Lee on 16.10.2016.
 */
public class RookieKit {
    ArrayList<Stationary> stationary = new ArrayList<>();

    public RookieKit() {
        stationary.add(new Pen("Bic", 0.5));
        stationary.add(new Pencil("Bic", 0.4));
        stationary.add(new Notebook("Memo", 0.2));
        stationary.add(new PaperForPrinting("Svetocopy", 1.5));
        stationary.add(new File("F", 0.1));
        stationary.add(new FileFolder("Folder", 0.9));
        stationary.add(new HolePunch("Puncher", 1.5));
        stationary.add(new Stapler("StapStap", 1.0));
        stationary.add(new Tapes("Tapes", 0.4));
    }

    public ArrayList<Stationary> getStationary(){
        return stationary;
    }

    //    Set<Stationary> stationary = new TreeSet<Stationary>();
    Comparator<Stationary> comparatorByName = new StationaryNameComparator();
    Comparator<Stationary> comparatorByPrice = new StationaryPriceComparator();

//    public RookieKit() {
////        Set<Stationary> st = new TreeSet<Stationary>(comparatorByPrice);
//        stationary.add(new Pen("Bic", 0.5));
//        stationary.add(new Pencil("Bic",0.4));
//        stationary.add(new Notebook("Memo",0.2));
//        stationary.add(new PaperForPrinting("Svetocopy",1.5));
//        stationary.add(new File("F",0.1));
//        stationary.add(new FileFolder("Folder",0.9));
//        stationary.add(new HolePunch("Puncher",1.5));
//        stationary.add(new Stapler("StapStap",1.0));
//        stationary.add(new Tapes("Tapes",0.4));
//    }
//
//    public TreeSet<?> getStationary(){
//        return (TreeSet<?>) stationary;
//    }

//    Set<Stationary> set = new TreeSet<>();
//
//    {
//        set.add(new Pen("Bic", 0.5));
//        set.add(new Pencil("Bic",0.4));
//        set.add(new Notebook("Memo",0.2));
//        set.add(new PaperForPrinting("Svetocopy",1.5));
//        set.add(new File("F",0.1));
//        set.add(new FileFolder("Folder",0.9));
//        set.add(new HolePunch("Puncher",1.5));
//        set.add(new Stapler("StapStap",1.0));
//        set.add(new Tapes("Tapes",0.4));
//    }

}
