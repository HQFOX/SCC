package scc.srv;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/media")
public class MediaResource {

	//TODO: Method to be removed
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello world !!! -- TO BE REMOVED";
    }

    @POST
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    @Produces(MediaType.APPLICATION_JSON)
    public String upload( byte[] contents) {
        return "Some code";
    }
}
