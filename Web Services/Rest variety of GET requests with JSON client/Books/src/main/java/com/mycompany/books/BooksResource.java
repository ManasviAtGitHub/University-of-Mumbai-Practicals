/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.books;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Manasvi
 */
@Path("book")
public class BooksResource extends WebApplicationException{
    
    
    
    BooksService service = new BooksService();

    @GET
    public Response empty(){ 
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    
    
    @GET
    @Path("/list_books")
    @Produces(MediaType.APPLICATION_JSON)
    
    public List<Books> getResource() throws SQLException{    
        return service.book_lists();       
    }
    
    @GET
    @Path("/list_books")
    @Produces(MediaType.APPLICATION_XML)
    public List<Books> getResource_XML() throws SQLException{    
        return service.book_lists();       
    }
    
    
    
    
    @GET
    @Path("/audiobook")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Books> checkAudiobooks(@QueryParam("audio") boolean value) throws SQLException{
        return service.audiobooks(value);
    }
    
    
    @GET
    @Path("/audiobook+price")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Books> getSelectedAudiobooks(@MatrixParam("audio") boolean value, @MatrixParam("price") double price) throws SQLException{
        return service.getSelectedBooks(value,price);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/details")
    public List details(@PathParam("id")int id) throws SQLException{
        return service.individualBookDetails(id);
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/details+structure")
    public Books details_structure(@PathParam("id")int id) throws SQLException{
        return service.bookdetail(id);
    }
    
    
    
    
    
    
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void update(@PathParam("id")int id,Books book) throws SQLException{
        service.updateInDatabase(id, book);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void create(@PathParam("id")int id,Books book) throws SQLException{
        service.createInDatabase(id, book);
    }
    
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") int id) throws SQLException{
        service.deleteInDatabase(id);
    }   
    
   
    
    
    
    
    
    
    
    
}
