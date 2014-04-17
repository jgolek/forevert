package org.forevert.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonCreator;

@XmlRootElement
public class Page {

	public String name;
	
	/** In markdown syntax */
	public String content;

	public Page() {
		// TODO Auto-generated constructor stub
	}
	
	@JsonCreator
	public Page(String content) {	
		this.content = content;
	}
}
