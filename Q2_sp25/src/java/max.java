/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 *
 * @author nofom
 */
@WebServlet(urlPatterns = {"/max"})
public class max extends HttpServlet {

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
        String str = request.getParameter("str");
        if (str == null || str.isEmpty()) {
            request.setAttribute("str", str);
            request.setAttribute("err", "You must input string str");
            request.getRequestDispatcher("MyExam.jsp").forward(request, response);
        } else {

            String[] words = str.split("\\s+");
            //find max length
            int maxLength = 0;
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }

            boolean isFirst = true;
            String maxWord = "";
            for (String word : words) {
                if (word.length() == maxLength) {
                    if (isFirst) {
                        maxWord += word;
                        isFirst = false;
                    } else {
                        maxWord += ", " + word;
                    }
                }
            }

            request.setAttribute("str", str);
            request.setAttribute("re", maxWord);

            HttpSession session = request.getSession();
            ArrayList<Execution> list = new ArrayList<>();
            if(session.getAttribute("list") != null){
                list = (ArrayList<Execution>) session.getAttribute("list");
            }
            if (isHasValue(list, str)) {
                request.setAttribute("err", "This str existed!");
            } else {
               list.add(new Execution(str, maxWord));
               session.setAttribute("list", list);
//            list.add(new Execution(str, maxWord));
//            list.add(new Execution("abc", "abc"));
//            list.add(new Execution("abc", "abc"));
//            list.add(new Execution("abc", "abc"));
//            list.add(new Execution("abc", "abc"));
//            request.setAttribute("list", list);

            }

            request.getRequestDispatcher("MyExam.jsp").forward(request, response);

        }
    }

    // kiem tra trong list xem co gia tri str chua
    boolean isHasValue(ArrayList<Execution> list, String t) {
        for (Execution execution : list) {
            if (execution.getStr().equals(t)) {
                return true;
            }
        }
        return false;
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
