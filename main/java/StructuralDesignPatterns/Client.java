package StructuralDesignPatterns;

public class Client {

	public static void main(String[] args) 
    {
        ProxyDemo proxy = new RealProxy();
        proxy.performAction();
    }
}
