public class Bao extends TaiLieu {
    private String ngayPhatHanh; // dd/MM/yyyy

    public Bao(String ma, String nxb, int soBan, String ngayPhatHanh) {
        super(ma, nxb, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.print("[Báo]     ");
        super.hienThiThongTin();
        System.out.printf(" | Ngày phát hành: %s%n", ngayPhatHanh);
    }
}