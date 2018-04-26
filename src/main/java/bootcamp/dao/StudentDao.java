package bootcamp.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import bootcamp.model.Student;

@Component
public class StudentDao {
	
	 public ArrayList<Student> list() {
	        ArrayList<Student>  listOfStudent = new ArrayList<>();
	
	    listOfStudent.add(new Student("Aaron"));
	    listOfStudent.add(new Student("Robert"));
	    listOfStudent.add(new Student("Susan"));
	    listOfStudent.add(new Student("Zane"));
	    listOfStudent.add(new Student("Powell"));
	    listOfStudent.add(new Student("Tony"));
	    listOfStudent.add(new Student("John"));
		return listOfStudent;
	    

}
	   
}