/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nagarajan
 */
public class LoginServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @throws SQLException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zval?useSSL=false","root","1234");
        PreparedStatement stmt;
        String sql1 = "Insert into signin values(?,?)";
        stmt  = conn.prepareStatement(sql1);
        stmt.setString(1,name);
        stmt.setString(2,pass);
        
        int res = stmt.executeUpdate();
        
        if(res>0){
                System.out.println("Insertion Successful");  
                response.sendRedirect("");  //Enter your Home page name which you want after sign up
        }
        else{
                System.out.println("Insertion Failed");
                response.sendRedirect("index.html");
        }
        
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
