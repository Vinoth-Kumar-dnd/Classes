package classesobj;

public class TeamClass {

	public String name;
	public String city;
	public String division;
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
