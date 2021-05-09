package JavaReactOdev3;
public class Instructor extends User {
      String lessonsName;
      String homework;
      
	public Instructor(int id, String password, String lessonsName, String homework) {
		super(id, password);
		this.lessonsName = lessonsName;
		this.homework = homework;
	}
	
	public String getLessonsName() {
		return lessonsName;
	}
	public void setLessonsName(String lessonsName) {
		this.lessonsName = lessonsName;
	}
	public String getHomework() {
		return homework;
	}
	public void setHomework(String homework) {
		this.homework = homework;
	}
      

	
	
}
