package examples.jee.business;

import java.lang.reflect.Method;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.AroundTimeout;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Audit
public class InterceptorAudit {

	@AroundInvoke
//	@AroundConstruct
//	@AroundTimeout
	public Object interceptExecuteAudit(InvocationContext ctx) throws Exception{
		// ejecucion de la logica del interceptor
		System.out.println("Entering class: " + ctx.getMethod().getDeclaringClass().getName());
		System.out.println("Entering method: " + ctx.getMethod().getName());
		System.out.println("Ejecutando la auditoria");
		Object[] parameters = (Object[]) ctx.getParameters();
		Method method = ctx.getMethod();
		
		AnnotationParameters annotation = method
                .getAnnotation( 
                		AnnotationParameters 
                        .class); 
		
		System.out.println("key: " + annotation.key()); 
        System.out.println("value: " + annotation.value()); 
		
		Class<?> resourceClass = method.getDeclaringClass();
		boolean isAccessAllowed = true;
        //or logger.info statement 
		// Ejecucion de la logica del metodo del interceptor
		// Nota: si no se ejecuta esta instruccion no se ejecuta el metodo
		Object out = null;
		if(isAccessAllowed)
			out = ctx.proceed();
		// Ejeucucion de la logica final del interceptor despues de haber devuelto el resultado el metodo "out"
        return out;
	}

}
