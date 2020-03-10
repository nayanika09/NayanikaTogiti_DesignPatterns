package CreationalDesignPatterns;

public class SingletonDesignPatternExample {
	
	private volatile static SingletonDesignPatternExample obj; 
	public String str;
	private SingletonDesignPatternExample() {
		 str="Singleton Creational Design Pattern";
		 }
	  
	public static SingletonDesignPatternExample getInstance() 
	    { 
	        if (obj == null) 
	        { 
	            synchronized (SingletonDesignPatternExample.class) 
	            { 
	                if (obj==null) 
	                    obj = new SingletonDesignPatternExample(); 
	            } 
	        } 
	        return obj; 
	    } 
	

}
