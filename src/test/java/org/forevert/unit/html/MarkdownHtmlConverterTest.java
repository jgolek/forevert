package org.forevert.unit.html;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MarkdownHtmlConverterTest {

	@Test
	public void testToHtml() throws Exception {

		String markdownSnippet = "# An exhibit of Markdown";
		
		String expectedHtmlSnippet = "<h1>An exhibit of Markdown</h1>";
		
		String toHtmlConvertedMarkdownSnippet = MarkdownHtmlConverter.toHtml(markdownSnippet);
		
		
		assertThat(expectedHtmlSnippet).isEqualTo(toHtmlConvertedMarkdownSnippet);
		
	}
}
