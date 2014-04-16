package org.forevert.unit.html;

import static org.assertj.core.api.Assertions.assertThat;

import org.forevert.model.Page;
import org.forevert.unit.io.PageTemplate;
import org.junit.Test;

public class HtmlRendererTest {

	@Test
	public void testRenderHtml() throws Exception {
		Page page = new Page();
		page.name = "test";
		String contentAsHtml = "<h1>Content</h1>";
		
		PageTemplate pageTemplate = new PageTemplate();
		pageTemplate.fileName = "file.soy";
		pageTemplate.content = ""
				+ "{namespace org.forevert}\n"
				+ "/**"
				+ " @param pageName\n"
				+ "\n"
				+ "*/\n"
				+ "{template .main}\n"
				+ "<h1>{$pageName}</h1>\n"
				+ "{/template}\n";

		String html = HtmlRenderer.renderHtml(page, pageTemplate, contentAsHtml);
		
		String expectedHtmlSnippet = "<h1>test</h1>";
		
		assertThat(expectedHtmlSnippet).isEqualTo(html);
	}
}
