package baitapRikkei.bai1;

public class circle {
    private double radius;
    private String color;

    public circle() {

    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // diẹn tich
    public double acreage(){
        return radius * radius * Math.PI;
    }

    // Phuong thuc toString
    @Override
    public String toString(){
        return "Circle [radius=" + this.radius + ", color=" + this.color + ", acreage= " + acreage() + "]";
    }
}
