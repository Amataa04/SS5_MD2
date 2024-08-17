package ra.demo.list;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        // Tạo danh sách chứa n tên của nyc
        List<String> nycs = new ArrayList<>();

        // thêm phần tử vào list
        nycs.add("Hoa");
        nycs.add("Mai");
        nycs.add("Hồng");
        nycs.add("Hạnh");

        // duyêt qua các phần tử
        for (String nyc : nycs) {
            System.out.println(nyc);
        }
    }
}
