package examples.jee.business;

import javax.enterprise.event.Observes;

import examples.jee.dto.EventLibraryDTO;

public class EventManagementLibrary {

	public void execute(@Observes EventLibraryDTO event) {

		if ("NEW".equals(event.getStatus()) || event.getYearOld() <= 0) {
			System.out.println("registrar libro: " + event.getTitle());
		}
	}

}
