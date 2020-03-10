package StructuralDesignPatterns;

public class ZooKeeper {

	    private Animal lion;
	    private Animal horse;
	    private Animal bear;
	    
	    public ZooKeeper() {
	        lion = new Lion();
	        horse = new Horse();
	        bear = new Bear();
	    }
	    
	    public void feedLion() {
	        lion.feed();
	    }
	    
	    public void feedHorse() {
	        horse.feed();
	    }
	    
	    public void feedBear() {
	        bear.feed();
	    }
	

}
