package model;

public class DatPhong {
   private int idPhong, idUser, idHomeStay, trangthai, soNguoi;
   private String ngayDen, ngayDi;
   private double thanhtoan;

    public DatPhong(int idPhong, int idUser, int idHomeStay, int trangthai, int soNguoi, String ngayDen, String ngayDi, double thanhtoan) {
        this.idPhong = idPhong;
        this.idUser = idUser;
        this.idHomeStay = idHomeStay;
        this.trangthai = trangthai;
        this.soNguoi = soNguoi;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.thanhtoan = thanhtoan;
    }

    public DatPhong() {
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdHomeStay() {
        return idHomeStay;
    }

    public void setIdHomeStay(int idHomeStay) {
        this.idHomeStay = idHomeStay;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public double getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(double thanhtoan) {
        this.thanhtoan = thanhtoan;
    }
}
