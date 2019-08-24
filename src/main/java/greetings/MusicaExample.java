package greetings;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class MusicaExample {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MusicaExample.class); 
	
	public String rock(){
		LOGGER.error("hola mundo");
		return "Red Hot Chili Peppers";
	}

	

}
