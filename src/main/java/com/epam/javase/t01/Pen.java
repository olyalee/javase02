package com.epam.javase.t01;

/*Разработайте спецификацию и создайте класс Ручка (Pen). Определите в этом классе методы equals(), hashCode() и toString(). */

/**
 * This class has to store info about pen (such as the refill thickness in mm, the color of the refill, the name of the brand, the price in dollars).
 */
public class Pen {
    double point;
    String color;
    String brand;
    double price;

    public Pen(){
        point = 0.7;
        color = "blue";
        brand = "";
        price = 0.0;
    }

    public Pen(double point, String color, String brand, double price){
        setPoint(point);
        setColor(color);
        setBrand(brand);
        setPrice(price);
    }

    double getPoint(){
        return point;
    }

    void setPoint(double point){
        this.point = point;
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }

    String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return getClass().getSimpleName() + ": brand = " + brand + ", price = " + price + ", color = " + color + ", refill thickness = " + point + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.getPoint(), getPoint()) != 0) return false;
        if (Double.compare(pen.getPrice(), getPrice()) != 0) return false;
        if (getColor() != null ? !getColor().equals(pen.getColor()) : pen.getColor() != null) return false;
        return getBrand() != null ? getBrand().equals(pen.getBrand()) : pen.getBrand() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPoint());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}