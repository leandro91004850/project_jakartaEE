package org.eclipse.jakarta.controller;
import org.eclipse.jakarta.model.Hello;
import org.eclipse.jakarta.services.ConnectOracleDBService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldResource {

	ConnectOracleDBService connectOracleDBService = new ConnectOracleDBService();
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Hello hello(@QueryParam("name") String name) {
		if ((name == null) || name.trim().isEmpty())  {
			name = "world";
		}

		connectOracleDBService.connectOracleDB();

		return new Hello(name);
	}
}