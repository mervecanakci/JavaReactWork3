package JavaReactOdev3;
public class StudentManager extends UserManager  {
    @Override
           public void add(Student student) {
         System.out.println( student.getStudentNumber()+ " numaral� ��renci "+student.getLessonsName() + " adl� derse girdi");
	
	
}
    public void homework(Student homework) {
    	System.out.println(homework.getFirstName()+ homework.getHomework() +" �devini tamamlad� ");
    }
}