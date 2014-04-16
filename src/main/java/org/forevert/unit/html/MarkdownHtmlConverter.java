package org.forevert.unit.html;

import org.pegdown.LinkRenderer;
import org.pegdown.PegDownProcessor;
import org.pegdown.ToHtmlSerializer;
import org.pegdown.ast.RootNode;
import org.pegdown.ast.TableNode;

public class MarkdownHtmlConverter {

	public static String toHtml(String content) {

		
		PegDownProcessor pegDownProcessor = new PegDownProcessor(org.pegdown.Extensions.TABLES);
		
		RootNode astRoot = pegDownProcessor.parseMarkdown(content.toCharArray());

		ToHtmlSerializer serializer = new ExtendHtmlTableSerializer(new LinkRenderer());
		return serializer.toHtml(astRoot);
	}
	
	static class ExtendHtmlTableSerializer extends ToHtmlSerializer{
		public ExtendHtmlTableSerializer(LinkRenderer linkRenderer) {
			super(linkRenderer);
		}
		
	    public void visit(TableNode node) {
	        currentTableNode = node;
	        String tag = "table";
	        
            printer.println().print('<').print(tag).print(" class='table table-bordered ' ").print('>').indent(+2);
            visitChildren(node);
            printer.indent(-2).println().print('<').print('/').print(tag).print('>');
	        currentTableNode = null;
	    }
	}
}
