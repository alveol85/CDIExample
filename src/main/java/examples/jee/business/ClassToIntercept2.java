package examples.jee.business;

import javax.inject.Singleton;

import examples.jee.dto.ClassToInterceptDTO;

@Singleton
public class ClassToIntercept2 {

	@Audit
	@AnnotationParameters(key = "fruta", value = "uva")
	public ClassToInterceptDTO intercepMethodCalculateTotalPrice(int quantity, String user) {
		
		System.out.println("throw intercep method 2");
		
		ClassToInterceptDTO classToIntercept = new  ClassToInterceptDTO();
		classToIntercept.setPrice(3000);
		classToIntercept.setProduct("Lapiz");
		classToIntercept.setUser(user);
		classToIntercept.setTotalValue(classToIntercept.getPrice() * quantity);
		
		return classToIntercept;
	}
	
	@AnnotationParameters(key = "fruta", value = "mango")
	public void anotherMethodWithoutIntercept(String user) {
		
		System.out.println("method witout intercept executed by " + user);
		 
	}

}
