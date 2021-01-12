package dao.AdminDao.Mapper;

import model.Booking;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatPhongMapper implements RowMapper<Booking> {
    @Override
    public Booking mapRow(ResultSet rs) {
        Booking booking;
        try {
            int id = rs.getInt("id");
            int idUser = rs.getInt("iduser");
            int idHomeStay = rs.getInt("idhomestay");
            int trangthai = rs.getInt("trangthai");
            String ngayden = rs.getString("ngayden");
            String ngaydi = rs.getString("ngaydi");
            int songuoi = rs.getInt("songuoi");
            double thanhtoan = rs.getDouble("thanhtoan");
            booking = new Booking(id, idUser, idHomeStay, trangthai, songuoi, ngayden, ngaydi, thanhtoan);
            return booking;
        } catch (SQLException throwables) {
            return null;
        }

    }
}
