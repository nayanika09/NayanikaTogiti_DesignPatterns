package epam.BehavioralDesignPatterns;

public class Delivered implements OrderState{
	private static Delivered instance = new Delivered();
	 
   
    public static Delivered instance() {
        return instance;
    }
     
  
    public void updateState(DeliveryDetails ctx) 
    {
        System.out.println("Product is delivered!!");
    }

}
