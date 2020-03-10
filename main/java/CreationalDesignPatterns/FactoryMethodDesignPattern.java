package CreationalDesignPatterns;

public class FactoryMethodDesignPattern {
	
     public static class PersonFactory {
		 
		   public static Person getPerson(String name, String gender) {
		 
			   if(gender.equalsIgnoreCase("M")) {
		 
				   return new Male(name);
		 
			   } else if(gender.equalsIgnoreCase("F")) {
		 
				   return new Female(name);
			   	} 
		      return null;
		 
		     }
		 
		  }

     static abstract class Person {
     	private String name;
     	 Person(String name) {
     	 
     	   this.name = name;
     	 
     	 }
         abstract String getSalutation();
     	 
       String getNameAndSalutation() {
     	  return getSalutation()+name;
       }
              
      }
    static class Female extends Person {
    	 
    	    public Female(String name) {
    	    	super(name);
    		   }
    		  String getSalutation() {
    		      return "Miss/Mrs.";
    	        }
    	}
    static class Male extends Person {
   	 
  	  public Male(String name) {
  	       super(name);
  	 
  	    }
  	
  	   String getSalutation() {
  	 
  	      return "Mr.";
  	 
  	      }
  	 
  	  }
   
    public static void main(String[] args) {
		 
		  Person male = PersonFactory.getPerson("Jackson", "M");
		 
		    System.out.println(male.getNameAndSalutation());
		 
		    Person female = PersonFactory.getPerson("Tara", "F");
		 
		    System.out.println(female.getNameAndSalutation());
		 
		   }
}
		 
 
		 
       
		 
	  
	
		    
	


