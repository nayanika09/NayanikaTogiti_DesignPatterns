package CreationalDesignPatterns;

public class SingletonExample {
	
	     public static void main(String args[])
	     {
	    SingletonDesignPatternExample text1 = SingletonDesignPatternExample.getInstance();
	    SingletonDesignPatternExample text2 = SingletonDesignPatternExample.getInstance();
	  
	    System.out.println("Upper Case : ");
	    text1.str = (text1.str).toUpperCase();
	    System.out.println("String from text1 is " + text1.str);
	
	    System.out.println("Lower Case : ");
	    text2.str = (text2.str).toLowerCase();
	    System.out.println("String from text1 is " + text2.str);
	     }


}
