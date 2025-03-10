package classesobj;

public class MovieDTO {

	
	
	private String Movie_name;
	private int Release_year;
	private String lang;
	private String Director;
	private String Genre;
	private String Lead;
	public String getMovie_name() {
		return Movie_name;
	}
	public void setMovie_name(String movie_name) {
		Movie_name = movie_name;
	}
	public int getRelease_year() {
		return Release_year;
	}
	public void setRelease_year(int release_year) {
		Release_year = release_year;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getLead() {
		return Lead;
	}
	public void setLead(String lead) {
		Lead = lead;
	}
}
