/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/JsonParse"})
public class JsonParse extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             //first we initialize url as our rest uri for get request
             URL url = new URL("http://localhost:8080/Books/webapi/book/list_books");
             //create an url connection and open connectivity to uri
             URLConnection req = url.openConnection();
             
             //connect to url connection object
             req.connect();
             //initialize parser of JsonParser
             JsonParser jp = new JsonParser(); 
             //Use the parser to get data from the uri using InputStream
             JsonElement root = jp.parse(new InputStreamReader((InputStream) req.getContent()));
             //As we know that given uri returns in json array format use the same
             JsonArray rootobj = root.getAsJsonArray();
             //Now design the html code, edit only the necessary where I have commented......
             out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Servlet JsonParse</title>");            
             out.println("</head>");
             out.println("<body>");
             /*As we need to display our data in table format create new table
             add the column names in as ID and NAME in first row
             */
             out.println("<table border=2>"
                    + "<tr>"
                    + "<td>Book Id</td>"
                    + "<td>Book Name</td>"
                    + "<td>Audio Form</td>"
                    + "<td>Book Price</td>"
                    + "</tr>");
             
             /*we have our table ready all we need is to add data
             so start with using your array object in loop
             
             the below syntax is as follow
             for object in array
                convert each object to JsonObject and simply call 
                get and column first and second and make sure to add
                in different cells
                
             */
             for(Object o:rootobj){
                out.println("<tr>");
                JsonObject ex=(JsonObject)o;
                out.println("<td>"+ex.get("bookid")+"</td>");
                out.println("<td>"+ex.get("bookname")+"</td>");
                out.println("<td>"+ex.get("audioform")+"</td>");
                out.println("<td>"+ex.get("price")+"</td></tr>");
             }
             //remember to close table
             out.println("</table>");
             out.println("</body>");
             out.println("</html>");

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
