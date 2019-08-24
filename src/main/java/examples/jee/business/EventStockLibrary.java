package examples.jee.business;

import javax.enterprise.event.Observes;

import examples.jee.dto.EventLibraryDTO;

public class EventStockLibrary {
	
	public void execute(@Observes EventLibraryDTO event) {

		if ("NEW".equals(event.getStatus()) || event.getYearOld() <= 0) {
			System.out.println("almacenar libro: " + event.getTitle());
		}
	}

}
