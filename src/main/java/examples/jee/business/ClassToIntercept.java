package examples.jee.business;

import javax.inject.Singleton;

import examples.jee.dto.ClassToInterceptDTO;

@Audit
@Singleton
public class ClassToIntercept {

//	@Audit
	@AnnotationParameters(key = "fruta", value = "pera")
	public ClassToInterceptDTO intercepMethodCalculateTotalPrice(int quantity) {
		
		System.out.println("throw intercep method");
		
		ClassToInterceptDTO classToIntercept = new  ClassToInterceptDTO();
		classToIntercept.setPrice(3000);
		classToIntercept.setProduct("Lapiz");
		classToIntercept.setUser("Adolfo");
		classToIntercept.setTotalValue(classToIntercept.getPrice() * quantity);
		
		return classToIntercept;
	}
	
	@AnnotationParameters(key = "fruta", value = "sandia")
	public void anotherMethodWithoutIntercept(String user) {
		
		System.out.println("method witout intercept executed by " + user);
		 
	}

}
