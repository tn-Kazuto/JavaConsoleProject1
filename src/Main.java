import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n+---------------------------------------------+\n");
        System.out.println("1. Nhap du lieu vao tu ban phim va luu tru du lieu vso danh sach (List)");
        System.out.println("2. Tinh tong gia tri trong danh sach");
        System.out.println("3. Tim ra gia tri lon nhat trong danh sach");
        System.out.println("4. Hien thi cac gia tri trong danh sach");
        System.out.println("5. Lưu tru thong tin vao trong file json, xml");
        System.out.println("\n+---------------------------------------------+\n");

        int choice = sc.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    chucnang1();
                    break;
                case 2:
                    chucnang2();
                    break;
                case 3:
                    chucnang3();
                    break;
                case 4:
                    chucnang4();
                    break;
                case 5:
                    chucnang5();
                    break;
                default:
                    System.out.println("Thoat chuong trinh. Chao ban><");
                    return;
            }
        }
    }

    static List<Double> danhSach = new ArrayList<>();

    public static void chucnang1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
        double n = sc.nextDouble();
        danhSach.add(n);
        System.out.println("Đã them thanh cong!");
    }

    public static void chucnang2() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        double tong = 0;
        for (Double so : danhSach) {
            tong += so;
        }
        System.out.println("Tổng các giá trị trong danh sách: " + tong);
    }

    public static void chucnang3() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống, không có giá trị lớn nhất!");
            return;
        }
        // Sử dụng Collections.max để tìm số lớn nhất trong List
        double max = Collections.max(danhSach);
        System.out.println("Giá trị lớn nhất trong danh sách là: " + max);
    }


    public static void chucnang4() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách hiện đang trống!");
        } else {
            System.out.println("--- CÁC GIÁ TRỊ TRONG DANH SÁCH ---");
            for (int i = 0; i < danhSach.size(); i++) {
                System.out.println("Vị trí " + i + ": " + danhSach.get(i));
            }
        }
    }


    public static void chucnang5() {
        try {
            // Tạo luồng ghi file tên là data.xml
            XMLEncoder encoder = new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream("data.xml")
                    )
            );

            // Ghi toàn bộ danh sách vào file
            encoder.writeObject(danhSach);
            encoder.close(); // Đóng luồng

            System.out.println("Đã lưu dữ liệu vào file data.xml thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi khi lưu file XML: " + e.getMessage());
        }
    }

}