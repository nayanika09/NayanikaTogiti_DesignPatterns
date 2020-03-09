package epam.BehavioralDesignPatterns;

public class Dispatched implements OrderState{

	private static Dispatched instance = new Dispatched();
	
    public static Dispatched instance() {
        return instance;
    }
     
    public void updateState(DeliveryDetails ctx) 
    {
        System.out.println("Package is dispatched !");
        ctx.setCurrentState(Delivered.instance());
    }

}
