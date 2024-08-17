package Book;

import java.util.Scanner;

public class Book {
    private String id;
    private String nameBook;
    private float importprice;
    private float exportprice;
    private String author;
    private float interest;
    private int year;

    public Book() {

    }

    public Book(String id, String nameBook, float price, String author, float interest, int year) {
        this.id = id;
        this.nameBook = nameBook;
        this.importprice = importprice;
        this.exportprice = exportprice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public float getImportprice() {
        return importprice;
    }
    public void setImportprice(float importprice) {
        this.importprice = importprice;
    }

    public float getExportprice() {
        return exportprice;
    }
    public void setExportprice(float exportprice) {
        this.exportprice = exportprice;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Nhập thông tin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số sách: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        this.nameBook = sc.nextLine();
        System.out.println("Nhập giá nhập của sách: ");
        this.importprice = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập giá xuất của sách: ");
        this.exportprice = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập tên tác giả: ");
        this.author = sc.nextLine();
        System.out.println("Nhập năm xuất bản");
        this.year = sc.nextInt();
    }

    // Hiển thị sách
    public void displayData(){
        System.out.println("Mã sách: " + this.id);
        System.out.println("Tên sách: " + this.nameBook);
        System.out.println("Giá nhập sách: " + this.importprice);
        System.out.println("Giá xuất sách: " + this.exportprice);
        System.out.println("Tên tác giả: " + this.author);
        System.out.println("Năm sản xuất: " + this.year);
        System.out.println("-----------------------------");
    }

    // Tính lợi nhuận sách
    public void profitCalculation(){
        this.interest = this.exportprice - this.importprice;
        this.displayData();
        System.out.println("Lợi nhuận: \n"+ this.interest);
        System.out.println("-----------------------------");
    }
}
