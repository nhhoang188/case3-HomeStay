package controller;

import dao.AdminDao.HomeStay.HomeStayDao;
import dao.AdminDao.User.UserDAO;
import model.HomeStay;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "booking", urlPatterns = "/booking")
public class BookingServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    UserDAO userDAO = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
