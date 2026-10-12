import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int nhapSo(String label) {
        while (true) {
            try {
                System.out.print(label);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }

    static String nhapChuoi(String label) {
        System.out.print(label);
        return sc.nextLine().trim();
    }

    static TaiLieu nhapTaiLieu(int loai) {
        String ma = nhapChuoi("Mã tài liệu: ");
        String nxb = nhapChuoi("Tên nhà xuất bản: ");
        int soBan = nhapSo("Số bản phát hành: ");
        switch (loai) {
            case 1:
                String tg = nhapChuoi("Tên tác giả: ");
                int soTrang = nhapSo("Số trang: ");
                return new Sach(ma, nxb, soBan, tg, soTrang);
            case 2:
                int so = nhapSo("Số phát hành: ");
                int thang = nhapSo("Tháng phát hành: ");
                return new TapChi(ma, nxb, soBan, so, thang);
            default:
                String ngay = nhapChuoi("Ngày phát hành (dd/MM/yyyy): ");
                return new Bao(ma, nxb, soBan, ngay);
        }
    }

    public static void main(String[] args) {
        QuanLyTaiLieu ql = new QuanLyTaiLieu();
        int chon;
        do {
            System.out.println("\n===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xoá tài liệu theo mã");
            System.out.println("3. Hiển thị thông tin tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("0. Thoát");
            chon = nhapSo("Chọn chức năng: ");

            switch (chon) {
                case 1:
                    int loai = nhapSo("Loại (1-Sách, 2-Tạp chí, 3-Báo): ");
                    if (loai < 1 || loai > 3) System.out.println("Loại không hợp lệ!");
                    else ql.themTaiLieu(nhapTaiLieu(loai));
                    break;
                case 2:
                    ql.xoaTaiLieu(nhapChuoi("Nhập mã cần xoá: "));
                    break;
                case 3:
                    ql.hienThiTatCa();
                    break;
                case 4:
                    ql.timTheoLoai(nhapSo("Loại (1-Sách, 2-Tạp chí, 3-Báo): "));
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}