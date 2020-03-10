package StructuralDesignPatterns;

public class RealProxy extends ProxyDemoImpl{
	public void performAction() 
    {
        
        System.out.println("Delegating work!");
        super.performAction();
    }

}
