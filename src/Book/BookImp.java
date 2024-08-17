package Book;

import java.util.*;
import java.util.stream.Collectors;

public class BookImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        // Menu
        do{
            System.out.println("*********************MENU******************");
            System.out.println("1. Nhập thông tin n sách (n nhập từ bàn phím)");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Thoát");
            System.out.println("Chọn từ 1 - 9");
            // chọn
            int choice = Integer.parseInt(sc.nextLine()); ;
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập số lượng sách");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Sách " + i);
                        Book books = new Book();
                        // Nhập thông tin sách
                        books.inputData();
                        // Thêm sách
                        list.add(books);
                    }
                    break;
                case 2:
                    for (Book book : list) {
                        book.profitCalculation();
                    }
                    break;
                case 3:
                    for (Book book : list) {
                        book.displayData();
                    }
                    break;
                case 4:
                    list.sort(Comparator.comparingDouble(Book::getExportprice));
                    System.out.println("Sách sau khi sắp xếp theo giá tăng giần");
                    for (Book book : list) {
                        book.displayData();
                    }
                    break;
                case 5:
                    list.sort((b1, b2) -> Float.compare(b2.getInterest(), b1.getInterest()));
                    System.out.println("Sách sau khi sắp xếp theo lợi nhuận giảm giần: ");
                    for (Book book : list) {
                        book.profitCalculation();
                    }
                    break;
                case 6:
                    System.out.println("Nhập theo tên sách cần tìm: ");
                    String name = sc.nextLine();
                    boolean check = false;
                    for (Book book : list) {
                        if (book.getNameBook().equalsIgnoreCase(name)){
                            book.displayData();
                            check = true;
                        }
                    }
                    if (!check){
                        System.out.println("Không tìm thấy sách với tên: " + name);
                    }
                    break;
                case 7:
                    Map<Integer, Long> booksByYear = list.stream().collect(Collectors.groupingBy(Book::getYear, Collectors.counting()));
                    booksByYear.forEach((year, count) -> {
                        System.out.printf("Năm : %d, Số lượng: %d\n", year, count);
                    });
                    break;
                case 8:
                    Map<String, Long> booksByAuthor = list.stream().collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
                    booksByAuthor.forEach((author, count) -> {
                        System.out.printf("Tác giả: " + author + ", Số lượng: " + count);
                    });
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn lại");
            }
        }
        while(true);
    }
}
