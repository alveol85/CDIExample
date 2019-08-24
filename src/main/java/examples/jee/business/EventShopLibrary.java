package examples.jee.business;

import javax.enterprise.event.Observes;

import examples.jee.dto.EventLibraryDTO;

public class EventShopLibrary {
	
	public void execute(@Observes EventLibraryDTO event) {

		if ("BAD".equals(event.getStatus()) || event.getYearOld() > 10) {
			System.out.println("comprar libro nuevo: " + event.getTitle());
		}
	}

}
