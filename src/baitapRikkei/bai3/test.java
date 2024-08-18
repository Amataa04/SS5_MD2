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

        triangle Triangle1 = new triangle(color, filled, side1, side2, side3);
        // triangle Triangle2 = new triangle(side1, side2, side3);
        System.out.println(Triangle1);
        System.out.printf("Chu vi: %.1f\n", Triangle1.perimeter());
        System.out.printf("Diện tích: %.1f", Triangle1.area());
    }
}
