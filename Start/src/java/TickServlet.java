/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author nofom
 */
public class TickServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.print("<p style="color: red; font-size: 154px;text-align: center;"> DAT </p>");
//                out.print("<p style=\"color: red; font-size: 154px;text-align: center;\"> DAT </p>");

            LocalDate today = LocalDate.now();
            LocalTime time = LocalTime.now();
            out.println(today);
//            out.println(today.getMonth());
//            out.println(today.getYear());
//            out.println("So ngay con lai truoc tet: " + today.datesUntil(LocalDate.of(2026, Month.JANUARY, 1)).count());
//            
//            
//            out.print(time);
//            out.print(time.getHour());
//            out.print(time.getMinute());

//            response.sendRedirect("https://ngaydep.com/con-bao-nhieu-ngay-nua-den-ngay-1-1-2026-duong-lich.html");

                // lay tu form
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            
                // gui toi form
                request.setAttribute("firstname", firstname);
                request.setAttribute("lastname", lastname);
              request.setAttribute("fullname", lastname +" "+ firstname);
              request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
