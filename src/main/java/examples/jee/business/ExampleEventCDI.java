package examples.jee.business;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import examples.jee.dto.EventLibraryDTO;

public class ExampleEventCDI {
	
	@Inject
	Event<EventLibraryDTO> event;
	
	public void libraryDevolution(){
		
		EventLibraryDTO eventLibrary = new EventLibraryDTO();
		eventLibrary.setStatus("BAD");	
		eventLibrary.setTitle("Book Bad");
		eventLibrary.setYearOld(20);
		
		event.fire(eventLibrary);
		
		eventLibrary = new EventLibraryDTO();
		eventLibrary.setStatus("NEW");	
		eventLibrary.setTitle("Book New");
		eventLibrary.setYearOld(1);
		
		event.fire(eventLibrary);
		
		eventLibrary = new EventLibraryDTO();
		eventLibrary.setStatus("NORMAL");	
		eventLibrary.setTitle("Book Normal ");
		eventLibrary.setYearOld(2);
		
		event.fire(eventLibrary);
		
		eventLibrary = new EventLibraryDTO();
		eventLibrary.setStatus("NORMAL");	
		eventLibrary.setTitle("Book Normal Recent");
		eventLibrary.setYearOld(0);
		
		event.fire(eventLibrary);
		
		eventLibrary = new EventLibraryDTO();
		eventLibrary.setStatus("NORMAL");	
		eventLibrary.setTitle("Book Normal Vete");
		eventLibrary.setYearOld(2);
		
		event.fire(eventLibrary);
		
	}

}
