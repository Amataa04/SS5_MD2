package baitapRikkei.bai3;

import java.awt.*;
import java.util.Scanner;

public class triangle extends shape {
    private double side1, side2, side3;

    public triangle(double side1, double side2, double side3) {
        super("no color", false);
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // chu vi
    public double perimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    // dien tich
    public double area(){
        return Math.sqrt((perimeter() / 2) * ((perimeter() / 2) - this.side1) * ((perimeter() / 2) - this.side2) * ((perimeter() / 2) - this.side3));
    }

    @Override
    public String toString() {
        return "Triangle[side1 = " + this.side1 + ", side2 = " + this.side2 + ", side3 = " + this.side3 +
                ", color = " + super.getColor() + ", filled = " + super.isFilled() + "]";
    }
}
