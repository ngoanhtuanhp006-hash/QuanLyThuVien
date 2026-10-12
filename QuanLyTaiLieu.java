import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu {
    private List<TaiLieu> danhSach = new ArrayList<>();

    private boolean tonTai(String ma) {
        for (TaiLieu tl : danhSach) {
            if (tl.getMaTaiLieu().equalsIgnoreCase(ma)) return true;
        }
        return false;
    }

    // Thêm mới (kiểm tra mã duy nhất)
    public boolean themTaiLieu(TaiLieu tl) {
        if (tonTai(tl.getMaTaiLieu())) {
            System.out.println("Mã tài liệu đã tồn tại!");
            return false;
        }
        danhSach.add(tl);
        System.out.println("Thêm thành công.");
        return true;
    }

    // Xoá theo mã
    public void xoaTaiLieu(String ma) {
        boolean daXoa = danhSach.removeIf(tl -> tl.getMaTaiLieu().equalsIgnoreCase(ma));
        System.out.println(daXoa ? "Đã xoá tài liệu." : "Không tìm thấy mã: " + ma);
    }

    // Hiển thị tất cả
    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Thư viện chưa có tài liệu.");
            return;
        }
        for (TaiLieu tl : danhSach) tl.hienThiThongTin();
    }

    // Tìm kiếm theo loại: 1-Sách, 2-Tạp chí, 3-Báo
    public void timTheoLoai(int loai) {
        Class<? extends TaiLieu> lop;
        switch (loai) {
            case 1: lop = Sach.class; break;
            case 2: lop = TapChi.class; break;
            case 3: lop = Bao.class; break;
            default:
                System.out.println("Loại không hợp lệ!");
                return;
        }
        boolean coKetQua = false;
        for (TaiLieu tl : danhSach) {
            if (lop.isInstance(tl)) {
                tl.hienThiThongTin();
                coKetQua = true;
            }
        }
        if (!coKetQua) System.out.println("Không có tài liệu thuộc loại này.");
    }
}