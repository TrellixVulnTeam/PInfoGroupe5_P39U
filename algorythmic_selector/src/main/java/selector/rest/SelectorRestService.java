package selector.rest;


import java.util.*;

import selector.model.*;

import java.io.IOException;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/selector")
public class SelectorRestService
{
   private selector selecteur;

   public SelectorRestService()throws IOException, InterruptedException
   {
       this.selecteur = new selector();
   }

   class critere {
    public double humour;
    public double horreur;
    public double action;
    public double drame;
    public double aventure;
   }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String Default()
    {
        return "You reached selector";
    }

    @POST 
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/catalogue")
    public critere getCatalogue(critere moyenne ){

	    return moyenne;
    }
    
}//end class
