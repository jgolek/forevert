package org.forevert.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Page {

	public String name;
	
	/** In markdown syntax */
	public String content;
	
}
