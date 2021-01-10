package dao.AdminDao.Mapper;

import model.DatPhong;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatPhongMapper implements RowMapper<DatPhong> {
    @Override
    public DatPhong mapRow(ResultSet rs) {
        DatPhong datPhong;
        try {
            int id = rs.getInt("id");
            int idUser = rs.getInt("iduser");
            int idHomeStay = rs.getInt("idhomestay");
            int trangthai = rs.getInt("trangthai");
            String ngayden = rs.getString("ngayden");
            String ngaydi = rs.getString("ngaydi");
            int songuoi = rs.getInt("songuoi");
            double thanhtoan = rs.getDouble("thanhtoan");
            datPhong = new DatPhong(id, idUser, idHomeStay, trangthai, songuoi, ngayden, ngaydi, thanhtoan);
            return datPhong;
        } catch (SQLException throwables) {
            return null;
        }

    }
}
