package bootcamp.service;

import java.util.ArrayList;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bootcamp.dao.StudentDao;
import bootcamp.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao sDao;
	
	
   public ArrayList<Student> studentNameInOrder(){
	   
		 ArrayList<Student> listOfStudent= sDao.list();
	    
	    listOfStudent.sort(new Comparator<Student>() {
	    		public int compare(Student s1, Student s2) {
            return s1.getStudentName().compareTo(s2.getStudentName());
	    }
    });
	     
	return listOfStudent;
	   
   }
  
   public ArrayList<Student> studentNameReverseOrder(){
	   
	   ArrayList<Student> listOfStudent= sDao.list();
	   
	    listOfStudent.sort(new Comparator<Student>() {
	    	public int compare(Student s1, Student s2) {
                if (s1.equals(s2)) {
                	return 0;
                	}
                if (s1.getStudentName().compareTo(s2.getStudentName()) > 0) {
                    return -1;
                }
                return 1;
            }
        });
	     
	    return listOfStudent;
	   
   }
}
