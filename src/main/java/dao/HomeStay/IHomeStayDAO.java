package dao.HomeStay;

import model.HomeStay;

import java.sql.SQLException;
import java.util.List;

public interface IHomeStayDAO {
 List<HomeStay> getAllHomeStay() throws SQLException;
 HomeStay getHomeStayInfo(int id) throws SQLException;
}
