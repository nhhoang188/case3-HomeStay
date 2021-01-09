package dao.User;

import dao.ConnectDB;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {
    Connection connectDB = ConnectDB.getInstance().getConnection();
    private static final String INSERT_USERS = "INSERT INTO nguoidung" + "  (acount, password, name, age, email, phonenumber, address) VALUES " + " (?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select name,age,email,phonenumber,address from nguoidung where id =?";
    private static final String SELECT_ALL_USERS = "select * from nguoidung";
    private static final String DELETE_USERS = "delete from nguoidung where id = ?;";
    private static final String UPDATE_USERS = "update nguoidung set name = ?, age =?, email= ?, phonenumber =?, address =?,  where id = ?;";

    @Override
    public void insertUser(User user) throws SQLException {
        try {
            PreparedStatement statement = connectDB.prepareStatement(INSERT_USERS);
            statement.setString(1, user.getAcount());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getAge());
            statement.setString(5, user.getEmail());
            statement.setString(6, user.getPhonenumber());
            statement.setString(7, user.getAddress());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) {
        User user = null;
        try {
            PreparedStatement statement = connectDB.prepareStatement(SELECT_USER_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String acount = rs.getString("name");
                String password = rs.getString("password");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String email = rs.getString("email");
                String phonenumber = rs.getString("phonenumber");
                String address = rs.getString("address");
                user = new User(name, age, email, password, acount, phonenumber, address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement statement = connectDB.prepareStatement(SELECT_ALL_USERS);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String acount = rs.getString("name");
                String password = rs.getString("password");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String email = rs.getString("email");
                String phonenumber = rs.getString("phonenumber");
                String address = rs.getString("address");
                users.add(new User(name, age, email, password, acount, phonenumber, address));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted = false;
        try {
            PreparedStatement statement = connectDB.prepareStatement(DELETE_USERS);
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try {
            PreparedStatement statement = connectDB.prepareStatement(UPDATE_USERS);
            statement.setString(1, user.getName());
            statement.setString(2, user.getAge());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPhonenumber());
            statement.setString(5, user.getAddress());
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
