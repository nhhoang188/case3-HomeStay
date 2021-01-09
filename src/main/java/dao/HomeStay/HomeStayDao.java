package dao.HomeStay;

import dao.ConnectDB;
import model.HomeStay;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HomeStayDao implements IHomeStayDAO {
    static String SHOW_ALL_HOME_STAY = "select tenhomestay, giaphong, anh, thongtin from homestay ;";
    static String SHOW_HOME_STAY_INFOR = "SELECT * FROME HOMESTAY where id = ?;";
    Connection connection = ConnectDB.getInstance().getConnection();

    @Override
    public List<HomeStay> getAllHomeStay() throws SQLException {
        List<HomeStay> homeStayList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SHOW_ALL_HOME_STAY);
            while (resultSet.next()) {
                String ten = resultSet.getString("tenhomestay");
                double gia = resultSet.getDouble("giaphong");
                String anh = String.valueOf(resultSet.getLong("anh"));
                String thongtin = resultSet.getString("thongtin");
                homeStayList.add(new HomeStay(ten, gia, anh, thongtin));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return homeStayList;
    }

    @Override
    public HomeStay getHomeStayInfo(int id) throws SQLException {
        HomeStay homeStay = null;
        try {
            PreparedStatement statement = connection.prepareStatement(SHOW_HOME_STAY_INFOR);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int idhomestay = resultSet.getInt("id");
                String ten = resultSet.getString("tenhomestay");
                String diachi = resultSet.getString("diachi");
                String sdt = resultSet.getString("sdt");
                double gia = resultSet.getDouble("giaphong");
                String tienich = resultSet.getString("tienich");
                String thongtin = resultSet.getString("thongtin");
                String thongtin1 = resultSet.getString("thongtin1");
                String thongtin2 = resultSet.getString("thongtin2");
                String thongtin3 = resultSet.getString("thongtin3");
                String anh = resultSet.getString("anh");
                String anh1 = resultSet.getString("anh1");
                String anh2 = resultSet.getString("anh2");
                String anh3 = resultSet.getString("anh3");
                String link = resultSet.getString("link");
                homeStay = new HomeStay(idhomestay, ten, diachi, sdt, tienich, gia, link, anh, anh1, anh2, anh3, thongtin, thongtin1, thongtin2, thongtin3);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return homeStay;
    }
}
