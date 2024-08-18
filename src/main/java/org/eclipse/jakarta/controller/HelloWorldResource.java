package org.eclipse.jakarta.controller;
import org.eclipse.jakarta.model.Hello;
import org.eclipse.jakarta.services.AtivosServices;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldResource {

	@Inject
	private AtivosServices ativosServices;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Hello hello() {
		return new Hello("leandro");
	}
}