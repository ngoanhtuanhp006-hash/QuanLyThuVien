public abstract class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() { return maTaiLieu; }
    public String getTenNhaXuatBan() { return tenNhaXuatBan; }
    public int getSoBanPhatHanh() { return soBanPhatHanh; }

    public void hienThiThongTin() {
        System.out.printf("Mã: %s | NXB: %s | Số bản phát hành: %d",
                maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
    }
}