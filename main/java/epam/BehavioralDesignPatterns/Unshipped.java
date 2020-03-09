package epam.BehavioralDesignPatterns;

public class Unshipped implements OrderState{

	    private static Unshipped instance = new Unshipped();
	 
	    
	 
	    public static Unshipped instance() {
	        return instance;
	    }
	  
	    public void updateState(DeliveryDetails ctx) 
	    {
	        System.out.println("Package is unshipped !");
	        ctx.setCurrentState(InTransition.instance());
	}
}
