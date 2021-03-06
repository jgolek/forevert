package org.forevert;
 
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import org.forevert.model.Page;
import org.forevert.unit.html.BuildAHtmlPageFlow;
import org.forevert.unit.html.HtmlRenderer;
import org.forevert.unit.io.PageIo;
import org.forevert.unit.io.PageIoException;
import org.forevert.unit.io.PageTemplate;
import org.forevert.unit.io.PageTemplateIo;
 
@Path("/")
public class ForevertService {

	@GET
	public Response getStartPage() throws PageIoException, IOException {
		return this.showPage("getuserdata");
	}
	
	@GET
	@Path("{pageName}")
	public Response buildAHtmlPage(@PathParam("pageName") String pageName, @Context UriInfo info ) throws PageIoException, IOException {
		
		boolean editMode = info.getQueryParameters().containsKey("edit");
		
		if(editMode){
			return showEditor(pageName);
		}else{
			return showPage(pageName);
		}
	}
	
	@PUT
	@Path("{pageName}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePage(Page page, @PathParam("pageName") String pageName ) throws PageIoException, IOException {
		page.name = pageName;
		
		PageIo.save(page);
		
		return Response.status(200).build();
	}

	public Response showPage(String pageName) throws PageIoException, IOException {
		
		Page 		 page     = PageIo.find(pageName);
		PageTemplate template = PageTemplateIo.findByTemplateName("page.soy");

		String html = BuildAHtmlPageFlow.execute(page, template );
		return Response.status(200).entity(html).build();
	}
	
	public Response showEditor(@PathParam("pageName") String pageName) throws PageIoException, IOException {
		
		Page 		 page     = PageIo.find(pageName);
		PageTemplate template = PageTemplateIo.findByTemplateName("edit.soy");

		String html = HtmlRenderer.renderHtml(page, template, page.content);
		return Response.status(200).entity(html).build();
	}
}