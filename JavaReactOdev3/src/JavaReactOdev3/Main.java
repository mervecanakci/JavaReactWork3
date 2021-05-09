package JavaReactOdev3;
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(12345,"şifre","java kursu","ödev3","merve","çanakcı", 755);
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.homework(student);
		
	      Instructor instructor=new Instructor(987,"şifre eğitmen", "java , c#","ödev 4");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add1(instructor);
		instructorManager.add(instructor);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
