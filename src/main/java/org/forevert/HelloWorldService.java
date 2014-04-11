package org.forevert;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {

	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

	@GET
	@Path("")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getMsg() {
 
		User user = new User();
		user.user1 = new User();
		return Response.status(200).entity(user).build();
 
	}
}