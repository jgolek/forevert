import static org.junit.Assert.*;

import org.codehaus.jackson.map.ObjectMapper;
import org.forevert.model.Page;
import org.junit.Test;


public class PageJsonMappingTest {

	
	@Test
	public void testName() throws Exception {
		
		String json="{\"content\": \"mydata\" }";
	    ObjectMapper mapper = new ObjectMapper();

	    Page page = mapper.readValue(json, Page.class);
		System.out.println(page);
	}
}
