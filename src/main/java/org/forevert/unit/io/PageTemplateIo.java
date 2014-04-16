package org.forevert.unit.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class PageTemplateIo {

	public static PageTemplate findByTemplateName(String pageTemplateName) throws IOException{
		
		String content = FileUtils.readFileToString(new File("src/main/resources", pageTemplateName));

		PageTemplate template = new PageTemplate();
		template.fileName = pageTemplateName;
		template.content = content;
		
		return template;
	}
}
