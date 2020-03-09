package epam.BehavioralDesignPatterns;

public class StateDesignPattern {

	
	public static void main(String[] args) {
		DeliveryDetails ctx = new DeliveryDetails(null, "Test123");
        
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
       
	}

}
