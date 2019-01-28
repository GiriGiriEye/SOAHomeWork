package model;

public class CourseGrade {
	
	private String courseGrade_property;
	
	private int courseGrade_number;
	
	private Grade courseGrade_Grade;
	
	public CourseGrade(String courseGrade_property, int courseGrade_number, Grade courseGrade_Grade) {
		this.courseGrade_property = courseGrade_property;
		this.courseGrade_number = courseGrade_number;
		this.courseGrade_Grade = courseGrade_Grade;
	}
	
	public String getCourseGrade_property() {
		return this.courseGrade_property;
	}
	
	public void setCourseGrade_Property(String courseGrade_property) {
		this.courseGrade_property = courseGrade_property;
	}
	
	public int getCourseGrade_Number() {
		return this.courseGrade_number;
	}
	
	public void setCourseGrade_Number(int courseGrade_number) {
		this.courseGrade_number = courseGrade_number;
	}
	
	public Grade getCourseGrade_Grade() {
		return this.courseGrade_Grade;
	}
	
	public void setCourseGrade_Grade(Grade courseGrade_grade) {
		this.courseGrade_Grade = courseGrade_grade;
	}
}
