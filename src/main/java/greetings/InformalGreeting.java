package greetings;

@informal
public class InformalGreeting extends Greeting {
	
	public InformalGreeting(){}
	
	public String greet(String name) {
		 return "Hi, " + name + "! ";
    }
}
