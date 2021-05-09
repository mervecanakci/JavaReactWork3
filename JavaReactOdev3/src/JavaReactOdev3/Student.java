package JavaReactOdev3;
public class Student extends Instructor{

	String firstName;
	String lastName;
    int studentNumber;
    
	public Student(int id, String password, String lessonsName, String homework, String firstName, String lastName,
			 int studentNumber) {
		super(id, password, lessonsName, homework);
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
    
	



















}