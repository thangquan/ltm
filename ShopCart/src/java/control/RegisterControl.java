/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import dao.RegisterDAO;
import entity.Category;
import entity.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "RegisterControl", urlPatterns = {"/RegisterControl"})
public class RegisterControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            String userName = request.getParameter("user");
            String password = request.getParameter("pass");
            String repassword = request.getParameter("repass");

            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            session.setAttribute("password", password);

            if (password.equals(repassword)) {
                session.setAttribute("message", "Nhập lại mật khẩu không giống nhau");
                RegisterDAO register = new RegisterDAO();
                int account = register.Register(userName, password, 0);

                if (account == 0) {
                    
                    session.invalidate();
                    session.setAttribute("message", "Đăng ký không thành công");
                    response.sendRedirect("Login.jsp");
                    
//            RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/Home.jsp");
//            dispatch.forward(request, response);
                } else {
                    DAO dao = new DAO();
                    List<Product> list = dao.getAllProduct();
                    List<Category> listC = dao.getAllCategory();
                    Product last = dao.getLast();

                    //b2: set data to jsp
                    request.setAttribute("listP", list);
                    request.setAttribute("listCC", listC);
                    request.setAttribute("p", last);

                    RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/Home.jsp");
                    dispatch.forward(request, response);
                }
            } else {
                response.sendRedirect("Login.jsp");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
