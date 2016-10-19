package com.epam.javase.t05;

/**
 * Created by Olya Lee on 18.10.2016.
 */
public class Mark <T extends Number> {

    public T mark;

    public Mark(T value){
        mark = value;
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark)) return false;

        Mark<?> mark1 = (Mark<?>) o;

        return getMark().equals(mark1.getMark());

    }

    @Override
    public int hashCode() {
        return getMark().hashCode();
    }

    @Override
    public String toString() {
        return mark.toString();
    }
}
