package org.forevert;
 
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.forevert.model.Page;
import org.forevert.unit.html.BuildAHtmlPageFlow;
import org.forevert.unit.io.PageIo;
import org.forevert.unit.io.PageIoException;
import org.forevert.unit.io.PageTemplate;
import org.forevert.unit.io.PageTemplateIo;
 
@Path("/")
public class ForevertService {

	@GET
	public Response getStartPage() throws PageIoException, IOException {
		return this.buildAHtmlPage("test");
	}
	
	@GET
	@Path("{pageName}")
	public Response buildAHtmlPage(@PathParam("pageName") String pageName) throws PageIoException, IOException {
		//if(true) return Response.status(200).entity("test").build();
		
		Page 		 page     = PageIo.find(pageName);
		PageTemplate template = PageTemplateIo.findByTemplateName("page.soy");

		String html = BuildAHtmlPageFlow.execute(page, template);

		
		return Response.status(200).entity(html).build();
	}
}