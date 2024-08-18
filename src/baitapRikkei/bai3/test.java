package baitapRikkei.bai3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh 1: ");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cạnh 2: ");
        double side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cạnh 3: ");
        double side3 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập màu: ");
        String color = sc.nextLine();
        System.out.println("tam giác có màu hay không?(true/false)");
        boolean filled = sc.nextBoolean();

        triangle Triangle = new triangle(color, filled, side1, side2, side3);
        shape Shape = new shape();
        System.out.println(Shape);
        System.out.println(Triangle);
        System.out.printf("Chu vi: %.1f\n", Triangle.perimeter());
        System.out.printf("Diện tích: %.1f", Triangle.area());
    }
}
