package classesobj;

public class TeamClass {

	private String name;
	private String city;
	private String division;
	TeamClass(){
		
	}
	
	TeamClass(String name,String city,String div){
		this.city=city;
		this.name=name;
		division=div;
	}
	public void playgame() {
		System.out.println("Start playing Team"+name);
	}
	
	public void hireCoach() {
		System.out.println("Hire coach ");
	}
}
