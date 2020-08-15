/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class BooksService {
    
    
    
    
    
    

    Connection conn;
    PreparedStatement pst;

    public void connect() throws SQLException{
        conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Library","root","root");
    }  
    
        
    public List<Books> book_lists() throws SQLException{
        List<Books> book_list = new ArrayList<>();
        connect() ;
        pst=conn.prepareStatement("Select * from books");
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
           
            book_list.add(new Books(rst.getInt(1),rst.getString(2),rst.getBoolean(3),rst.getDouble(4)));
        }
        return book_list;
    }
    
    
    public void updateInDatabase(int id,Books book) throws SQLException{
        connect() ;
        pst=conn.prepareStatement("Update Books set bookname=?,audioform=?,bookprice=? where bookid=? ");
        
        pst.setString(1, book.getBookname());
        pst.setBoolean(2, book.isAudioform());
        pst.setDouble(3, book.getPrice());
        pst.setInt(4, id);
        
        pst.executeUpdate();
    }

    public void createInDatabase(int id,Books book) throws SQLException{
        connect();
        pst=conn.prepareStatement("insert into Books values(?,?,?,?)");
        pst.setInt(1, id);
        pst.setString(2, book.getBookname());
        pst.setBoolean(3, book.isAudioform());
        pst.setDouble(4, book.getPrice());
        pst.executeUpdate();     
    }

    public void deleteInDatabase(int id) throws SQLException{
        connect();
        pst=conn.prepareStatement("delete from Books where bookid=?");
        pst.setInt(1, id);
        pst.executeUpdate();

    }

    public List individualBookDetails(int id) throws SQLException{
    
        List details = new ArrayList<>();
        
        connect() ;
        pst=conn.prepareStatement("Select * from books where bookid=?");
        pst.setInt(1, id);
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
             details.add(rst.getInt(1));
             details.add(rst.getString(2));
             details.add(rst.getBoolean(3));
             details.add(rst.getDouble(4));
             
        }
    
        return details;
    }
    
    public Books bookdetail(int id) throws SQLException{
        Books copy = new Books();
        connect() ;
        pst=conn.prepareStatement("Select * from books where bookid=?");
        pst.setInt(1, id);
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
             copy.setBookid(rst.getInt(1));
             copy.setBookname(rst.getString(2));
             copy.setAudioform(rst.getBoolean(3));
             copy.setPrice(rst.getDouble(4));
             
        }
        
        return copy;
    }
    
    
    
    public List<Books> audiobooks(boolean value) throws SQLException{
        List<Books> book_list = new ArrayList<>();
        connect() ;
        pst=conn.prepareStatement("Select * from books where audioform=?");
        pst.setBoolean(1, value);
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
            book_list.add(new Books(rst.getInt(1),rst.getString(2),rst.getBoolean(3),rst.getDouble(4)));
        }
        return book_list;
    }
    
    public List<Books> getSelectedBooks(boolean value, double price) throws SQLException{
        
        List<Books> book_list = new ArrayList<>();
        connect() ;
        pst=conn.prepareStatement("Select * from books where audioform=? and bookprice >= ?");
        pst.setBoolean(1, value);
        pst.setDouble(2,price);
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
            book_list.add(new Books(rst.getInt(1),rst.getString(2),rst.getBoolean(3),rst.getDouble(4)));
        }
        return book_list;
        
    }
    
}
