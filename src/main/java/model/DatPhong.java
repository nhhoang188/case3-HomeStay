package model;

public class DatPhong {
    private String ngayvao, ngaydi;
    private int songuoi;
    private double giathue;

    public DatPhong(String ngayvao, String ngaydi, int songuoi, double giathue) {
        this.ngayvao = ngayvao;
        this.ngaydi = ngaydi;
        this.songuoi = songuoi;
        this.giathue = giathue;
    }

    public DatPhong() {
    }

    public String getNgayvao() {
        return ngayvao;
    }

    public void setNgayvao(String ngayvao) {
        this.ngayvao = ngayvao;
    }

    public String getNgaydi() {
        return ngaydi;
    }

    public void setNgaydi(String ngaydi) {
        this.ngaydi = ngaydi;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }

    public double getGiathue() {
        return giathue;
    }

    public void setGiathue(double giathue) {
        this.giathue = giathue;
    }
}
