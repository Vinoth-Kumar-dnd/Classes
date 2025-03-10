package classesobj;

public class PlayerClass extends TeamClass {

	
	private String name;
	private int jerseyno;
	private String position;
	
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
