package epam.BehavioralDesignPatterns;

public class DeliveryDetails {
	private OrderState currentState;
    private String packageId;
     
    public DeliveryDetails(OrderState currentState, String packageId) 
    {
        super();
        this.currentState = currentState;
        this.packageId = packageId;
         
        if(currentState == null) {
            this.currentState = Unshipped.instance();
        }
    }
 
    public OrderState getCurrentState() {
        return currentState;
    }
 
    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }
     
    public String getPackageId() {
        return packageId;
    }
 
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }
 
    public void update() {
        currentState.updateState(this);
    }

}

