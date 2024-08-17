package product;

import java.util.Scanner;

public class Product {
    private String name;
    private String id;
    private int price;
    private int quantity;

    public Product(String name, String id, int price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Nhập thông tin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        this.name = sc.nextLine();
        System.out.println("Nhập mã số sản phẩm: ");
        this.id = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        this.price = sc.nextInt();
        System.out.println("Nhập số lượng sản phẩm");
        this.quantity = sc.nextInt();
    }
    // phương thức hiển thị thông tin
    public void displayData(){
        System.out.println("Tên sản phẩm: " + this.name);
        System.out.println("Mã số: " + this.id);
        System.out.println("Giá sản phẩm: " + this.price);
        System.out.println("Số lượng sản phẩm: " + this.quantity);
    }
}
