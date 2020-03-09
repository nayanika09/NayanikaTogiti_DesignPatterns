package epam.BehavioralDesignPatterns;

public class InTransition implements OrderState{

	 private static InTransition instance = new InTransition();
	 
	    private InTransition() {}
	 
	    public static InTransition instance() {
	        return instance;
	    }
	  
	    public void updateState(DeliveryDetails ctx) 
	    {
	        System.out.println("Package is processed !");
	        ctx.setCurrentState(Dispatched.instance());
	    }

}
