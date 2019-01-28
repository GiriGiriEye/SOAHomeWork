package model;

public class Grade {
	private String student_ID;
	
	private int grade;
	
	public Grade(String student_ID, int grade) {
		this.student_ID = student_ID;
		this.grade = grade;
	}
	
	public String getStudent_ID() {
		return this.student_ID;
	}
	
	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
