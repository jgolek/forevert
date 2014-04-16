package org.forevert.unit.html;

import org.forevert.model.Page;
import org.forevert.unit.io.PageTemplate;

public class BuildAHtmlPageFlow {

	public static String execute(Page page, PageTemplate template) {
		
		String contentAsHtml = MarkdownHtmlConverter.toHtml(page.content);
		
		String pageAsHtml = HtmlRenderer.renderHtml(page, template, contentAsHtml);
		
		return pageAsHtml;
	}
}
