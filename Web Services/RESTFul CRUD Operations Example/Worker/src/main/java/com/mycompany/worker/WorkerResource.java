
package com.mycompany.worker;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/* Global resource path  
   so till here path 
   http://localhost:8080/Worker/webapi/worker
*/ 
@Path("worker")
public class WorkerResource {
    //Need to create WorkerService to access the 
    //methods for crud operations
    WorkerService ws=new WorkerService();
    /*now for accessing get
      http://localhost:8080/Worker/webapi/worker
      as we are not adding further path
    */
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Worker> getWorkers() throws SQLException{    
        return ws.getFromDatabase();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Worker> getWorkers1() throws SQLException{
        return ws.getFromDatabase();
    } 
    
    
    /*now for accessing put
      http://localhost:8080/Worker/webapi/worker/1
      further changes in postman client
    */
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void update(@PathParam("id")int id,Worker wk) throws SQLException{
        ws.updateInDatabase(id, wk);
    }
    
    /*now for accessing post
      http://localhost:8080/Worker/webapi/worker/1
      further changes in postman client
    */
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void create(@PathParam("id")int id,Worker wk) throws SQLException{
        ws.createInDatabase(id, wk);
    }
    
    /*now for accessing delete
      http://localhost:8080/Worker/webapi/worker/1
      further changes in postman client
    */
    
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") int id) throws SQLException{
        ws.deleteInDatabase(id);
    }   
}
