package org.forevert.unit.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.forevert.model.Page;

public class PageIo {
	/**
	 * Reads the content.md file from page directory (<basedir>/<pagename>/content.md)
	 * and returns a page with the name and content. 
	 * 
	 * @param pageName
	 * @return page
	 * @throws IOException
	 */
	public static Page find(String pageName) throws PageIoException{
		String baseDir = ".";
		String pathWithFileName = pageName + "/content.md";
		File   pageFile = new File(baseDir, pathWithFileName);

		if(!pageFile.exists()){
			throw new PageIoException("Page not found. File "+pageFile.getAbsolutePath()+" doesn't exist");
		}
		
		String pageMarkdownContent = null;
		try {
			pageMarkdownContent = FileUtils.readFileToString(pageFile);
		} catch (IOException e) {
			throw new PageIoException("Couldn't read page file "+pageFile.getAbsolutePath(), e);
		}
		
		Page page = new Page();
		page.name = pageName;
		page.content = pageMarkdownContent;
		
		return page;
	}
}
