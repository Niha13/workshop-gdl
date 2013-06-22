package com.recluit.restservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MessageService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Server";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		return "<?xml version=\"1.0\"?>"+
				"<hello>Hello from xml</hello>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		return new StringBuilder("").append("<html>")
					.append("<body>Hello html</body>")
					.append("</html>").toString();
	}
}
