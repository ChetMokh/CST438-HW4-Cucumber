package edu.csumb.cst438fa16hello.rest;

import edu.csumb.cst438fa16hello.DayOfWeek;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * REST service that greets requests.
 *
 * This is a "root resource class" as explained in
 * https://jersey.java.net/documentation/latest/jaxrs-resources.html
 */

@Path("/")
public class HelloService {
    
    //function to calculate squared number
    @GET
    @Path("/calculate")
    public Response calculate(@QueryParam("input") int input) {
        
            int temp = input*input;
            String tempString = temp + "";
            return Response.ok(tempString).build();

    }
     
}
