package baitapRikkei.bai1;

public class cylinder extends circle{
    private double height;

    public cylinder() {

    }

    public cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // the tich
    public double volume(){
        return Math.PI * Math.pow(getRadius(), 2) * this.height;
    }

    // phuong thuc toString
    @Override
    public String toString(){
        return "Cylinder[radius= " + super.getRadius() + ", height= " + this.height + ", color=" + super.getColor() + ", volume=" + volume() + "]";
    }
}