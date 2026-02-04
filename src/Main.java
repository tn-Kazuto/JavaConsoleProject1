import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
//                    chucnang2();
                    break;
                case 3:
//                    chucnang3();
                    break;
                case 4:
//                    chucnang4();
                    break;
                case 5:
//                    chucnang5();
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
}