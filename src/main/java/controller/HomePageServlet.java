package controller;

import dao.AdminDao.HomeStay.HomeStayDao;
import dao.AdminDao.User.UserDAO;
import model.HomeStay;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "trang-chu", urlPatterns = "/trang-chu")
public class HomePageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    HomeStayDao homeStayDao =new HomeStayDao();
    UserDAO userDAO = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = 1;
////        request.setAttribute("user", homeStayDao.findHomeStayInfoById(id));
//        request.setAttribute("user", homeStayDao.findAllHomeStay());
//        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
//        rd.forward(request, response);
//        for (int i = 0; i < homeStayDao.findHomeStayInfoById(1).size(); i++) {
//            System.out.println(homeStayDao.findHomeStayInfoById(1).get(i).toString());
//        }
//        for (int i = 0; i < userDAO.findUserById(3).size(); i++) {
//            System.out.println(userDAO.findUserById(3).get(i).toString());
//        }
        String acount = "hoang1";
        String pasword = "1";
        String name = "Hoang";
        String age = "1996-08-08";
        String email = "1996@gmail.com";
        String phone = "19961808";
        String addres = "HN";

        userDAO.updateUser(new User(name,age, email, pasword, acount, phone, addres), 5);
    }

}
