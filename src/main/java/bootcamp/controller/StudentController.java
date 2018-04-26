package bootcamp.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import bootcamp.dao.StudentDao;
import bootcamp.model.Student;
import bootcamp.service.StudentService;


@Controller
public class StudentController {
 
	@Autowired
	StudentDao sDao;
	@Autowired
	StudentService sService;
	
	
	@RequestMapping("/studentinorder")
	@ResponseBody
    public ArrayList<Student> studentNameList(){
	 return sService.studentNameInOrder();
	   }
	
   @RequestMapping("/studentNameReverseOrder")
   @ResponseBody
   public ArrayList<Student> studentNameReverseList(){
	     
	  return sService.studentNameReverseOrder();
	   
   }
}
