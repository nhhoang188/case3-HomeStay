package model;

public class HomeStay {
    private int homestayID;
    private String tenhomestay, diachi, sdt, tienich;
    private double giaphong;
    private String link, anh, anh1, anh2, anh3, thongtin, thongtin1, thongtin2, thongtin3;

    public HomeStay(int homestayID, String tenhomestay, String diachi, String sdt, String tienich, double giaphong, String link, String anh, String anh1, String anh2, String anh3, String thongtin, String thongtin1, String thongtin2, String thongtin3) {
        this.homestayID = homestayID;
        this.tenhomestay = tenhomestay;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tienich = tienich;
        this.giaphong = giaphong;
        this.link = link;
        this.anh = anh;
        this.anh1 = anh1;
        this.anh2 = anh2;
        this.anh3 = anh3;
        this.thongtin = thongtin;
        this.thongtin1 = thongtin1;
        this.thongtin2 = thongtin2;
        this.thongtin3 = thongtin3;
    }

    public HomeStay(String tenhomestay, double giaphong, String anh, String thongtin) {
        this.tenhomestay = tenhomestay;
        this.giaphong = giaphong;
        this.anh = anh;
        this.thongtin = thongtin;
    }

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public String getThongtin1() {
        return thongtin1;
    }

    public void setThongtin1(String thongtin1) {
        this.thongtin1 = thongtin1;
    }

    public String getThongtin2() {
        return thongtin2;
    }

    public void setThongtin2(String thongtin2) {
        this.thongtin2 = thongtin2;
    }

    public String getThongtin3() {
        return thongtin3;
    }

    public void setThongtin3(String thongtin3) {
        this.thongtin3 = thongtin3;
    }

    public String getAnh1() {
        return anh1;
    }

    public void setAnh1(String anh1) {
        this.anh1 = anh1;
    }

    public String getAnh2() {
        return anh2;
    }

    public void setAnh2(String anh2) {
        this.anh2 = anh2;
    }

    public String getAnh3() {
        return anh3;
    }

    public void setAnh3(String anh3) {
        this.anh3 = anh3;
    }

    public HomeStay(int homestayID, String tenhomestay, String diachi, String sdt, String tienich, double giaphong, String link, String anh) {
        this.homestayID = homestayID;
        this.tenhomestay = tenhomestay;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tienich = tienich;
        this.giaphong = giaphong;
        this.link = link;
        this.anh = anh;
    }

    public HomeStay(int homestayID, String tenhomestay, String diachi, String sdt, String tienich, double giaphong, String link, String anh, String anh1, String anh2, String anh3) {
        this.homestayID = homestayID;
        this.tenhomestay = tenhomestay;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tienich = tienich;
        this.giaphong = giaphong;
        this.link = link;
        this.anh = anh;
        this.anh1 = anh1;
        this.anh2 = anh2;
        this.anh3 = anh3;
    }

    public HomeStay(int homestayID, String tenhomestay, String diachi, String sdt, String tienich, double giaphong, String link, String anh, String anh1, String anh2) {
        this.homestayID = homestayID;
        this.tenhomestay = tenhomestay;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tienich = tienich;
        this.giaphong = giaphong;
        this.link = link;
        this.anh = anh;
        this.anh1 = anh1;
        this.anh2 = anh2;
    }

    public HomeStay(int homestayID, String tenhomestay, String diachi, String sdt, String tienich, double giaphong, String link, String anh, String anh1) {
        this.homestayID = homestayID;
        this.tenhomestay = tenhomestay;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tienich = tienich;
        this.giaphong = giaphong;
        this.link = link;
        this.anh = anh;
        this.anh1 = anh1;
    }

    public HomeStay() {
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getHomestayID() {
        return homestayID;
    }

    public void setHomestayID(int homestayID) {
        this.homestayID = homestayID;
    }

    public String getTenhomestay() {
        return tenhomestay;
    }

    public void setTenhomestay(String tenhomestay) {
        this.tenhomestay = tenhomestay;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTienich() {
        return tienich;
    }

    public void setTienich(String tienich) {
        this.tienich = tienich;
    }

    public double getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(double giaphong) {
        this.giaphong = giaphong;
    }

    public String getLink() {
        return link;
    }


    public void setLink(String link) {
        this.link = link;
    }
}
