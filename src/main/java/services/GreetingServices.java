package services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import example.java8.business.LambdaExample;
import greetings.Greeting;
import greetings.MusicaExample;
import greetings.informal;


@Path("greetings")
@ApplicationScoped
public class GreetingServices {
	
	@Inject
	private MusicaExample musicaExample;
	
	@Inject @informal
	private Greeting greeting;
	
	
	@Path("informal/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getGreeting(@PathParam("name") String name){
		return greeting.greet(name);
	}
	
	@Path("musica")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCancion(){
		return musicaExample.rock();
	}
	
	
	
	
	
}