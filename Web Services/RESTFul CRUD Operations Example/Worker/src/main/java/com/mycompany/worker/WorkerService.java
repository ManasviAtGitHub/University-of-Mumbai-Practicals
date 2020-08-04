/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.worker;
import java.util.*;
/**
 *
 * @author User
 */
import java.sql.*;
public class WorkerService {
    ///Here we create a list of our worker class defined previously
    List<Worker> wlist=new ArrayList<>();
    //create connection and prepared statement objects for use in other methods
    Connection conn;
    PreparedStatement pst;
    //initialize connection object with the database string which you created
   
  
    public void connect() throws SQLException{
        conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Dept","root","root");
    }   
    //method which Http GET method utilizes for select all values you set in the table  
    public List<Worker> getFromDatabase() throws SQLException{
        /*Steps
        1.Call connect() for database connectivity
        2.write your query through prepareStatement() of connection object
        3.execute your query and make sure ResultSet object has the return value
        4.Finally read from your result set
        */    
        connect() ;
        pst=conn.prepareStatement("Select * from worker");
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
            /*Here we add the value from database in list, make sure you understand each part
                1.add in list using add() method
                2.we need to set values of worker list, you could this directly
                    by using the constructor and use resultset methods to access integer and string      */
            wlist.add(new Worker(rst.getInt(1),rst.getString(2)));
        }
    return wlist;
    }
    
    /*
    Following are the ways to create update delete from the database, queries
    are self explanatory all you need is to take good care how you use -->  ?
    which helps to set values
    */
    //map for put method
    public void updateInDatabase(int id,Worker wk) throws SQLException{
        connect() ;
        pst=conn.prepareStatement("Update worker set workername=? where workerid=?");
        pst.setString(1, wk.name);
        pst.setInt(2, id);
        pst.executeUpdate();
    }
    //map for post method 
    public void createInDatabase(int id,Worker wk) throws SQLException{
        connect();
        pst=conn.prepareStatement("insert into worker values(?,?)");
        pst.setInt(1, id);
        pst.setString(2, wk.name);
        pst.executeUpdate();     
    }
    //map for delete method
    public void deleteInDatabase(int id) throws SQLException{
        connect();
        pst=conn.prepareStatement("delete from worker where workerid=?");
        pst.setInt(1, id);
        pst.executeUpdate();

    }
}
