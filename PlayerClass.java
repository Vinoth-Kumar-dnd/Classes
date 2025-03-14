package classesobj;

public class PlayerClass extends TeamClass {

	
	public String name;
	public int jerseyno;
	public String position;
	
	PlayerClass(String name,int jno,String pos){
		
		this.name=name;
		jerseyno=jno;
		position=pos;
	}
	
	public void playgame() {
		System.out.println("Start playing player no"+jerseyno);
	}
	public void train() {
		System.out.println("Start training player no"+jerseyno);	
	}
}
