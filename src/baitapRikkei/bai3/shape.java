package baitapRikkei.bai3;

public class shape {
    private String color;
    private boolean filled;

    public shape() {
        this.color = "no color";
        this.filled = false;
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shape{" + "color = " + this.color + ", filled = " + this.filled + '}';
    }
}
