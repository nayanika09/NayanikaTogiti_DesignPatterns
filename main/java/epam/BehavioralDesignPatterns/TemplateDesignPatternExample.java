package epam.BehavioralDesignPatterns;

public class TemplateDesignPatternExample {
	public static void main(String[] agrs) {
		World obj=new Asia();
		Antartica ob=new Antartica();
		
		System.out.print("Continent : ");
		obj.getContinentName();
		System.out.println("Population : "+obj.getPopulation());
		System.out.print("Languages : ");
		obj.languagesSpoken();
		System.out.print("Continent : ");
		ob.getContinentName();
		System.out.println("Population : "+ob.getPopulation());
		System.out.print("Languages : ");
		ob.languagesSpoken();
	
		
	}
	

}
