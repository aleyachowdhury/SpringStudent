package bootcamp.model;

public class Student {
     private String studentName;
     
     
    public Student() {
    	
    }
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
     
}
