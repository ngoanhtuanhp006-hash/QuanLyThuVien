public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String ma, String nxb, int soBan, int soPhatHanh, int thangPhatHanh) {
        super(ma, nxb, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("[Tạp chí] ");
        super.hienThiThongTin();
        System.out.printf(" | Số phát hành: %d | Tháng: %d%n", soPhatHanh, thangPhatHanh);
    }
}