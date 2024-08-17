package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        // Khởi tạo hàm nhập
        Scanner sc = new Scanner(System.in);
        // Khai báo đối tượng sản phẩm
        List<Product> list = new ArrayList<>();
        // in menu
        do{
            System.out.println("===============MENU===============");
            System.out.println("1.Thêm mới sản phẩm");
            System.out.println("2.Danh sách sản phẩm");
            System.out.println("3.Thoát");
            System.out.println("Mời bạn chọn từ 1 - 3");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    // Khởi tạo đối tượng sản phẩm
                    Product product = new Product();
                    // Gọi đến inputData
                    product.inputData();
                    // Thêm sản phẩm
                    list.add(product);
                    break;
                case 2:
                    // tạo danh sách sản phẩm
                    System.out.println("========DANH SÁCH SẢN PHẨM========");
                    for(Product item : list) {
                        item.displayData();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        }
        while(true);
    }
}
