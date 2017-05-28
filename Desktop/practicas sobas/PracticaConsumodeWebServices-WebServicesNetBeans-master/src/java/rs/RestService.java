/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author BEAR
 */
@Path("RestService")
public class RestService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestService
     */
    public RestService() {
    }

    /**
     * Retrieves representation of an instance of rs.RestService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml() {
        //TODO return proper representation object
        return "lo que sea";
    }

    /**
     * PUT method for updating or creating an instance of RestService
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putXml(String content) {
        String string = new String("lol");
    }
    
    @GET
    @Path("/contertirDivisa/moneda={moneda}&cantidad={cantidad}")
    @Produces(MediaType.TEXT_PLAIN)
    public String convertirDivisa(@PathParam("moneda")String moneda, @PathParam("cantidad") String cantidad){
        Double valor = new Double(cantidad == null || cantidad.isEmpty() ? "0.0" : cantidad);
        System.out.println(cantidad);
        if(moneda.equals("USD")){
            valor *= 0.05379;
        }else if(moneda.equals("EUR")){
            valor *= 0.0506699;
        }else if(moneda.equals("GBP")){
            valor *= 0.0430231;
        }else if(moneda.equals("AUD")){
            valor *= 0.0711007;
        }else if(moneda.equals("CAD")){
            valor *= 0.0717013;
        }
        return valor.toString();
    }
}
