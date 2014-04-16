package org.forevert.unit.html;

import org.forevert.model.Page;
import org.forevert.unit.io.PageTemplate;

import com.google.template.soy.SoyFileSet;
import com.google.template.soy.data.SoyMapData;
import com.google.template.soy.tofu.SoyTofu;

public class HtmlRenderer {

	public static String renderHtml(Page page, PageTemplate template, String contentAsHtml) {
		
		SoyFileSet sfs = (new SoyFileSet.Builder()).add(template.content, template.fileName).build();
		
	    SoyTofu tofu = sfs.compileToTofu();

	    String html = tofu.newRenderer("org.forevert.main")
	    		.setData(new SoyMapData(
	    				"pageName", page.name, 
	    				"content", contentAsHtml))
	    		.render();
		
		return html;
	}
}
