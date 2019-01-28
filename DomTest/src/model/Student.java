package model;

import java.util.Date;


/**
 * 
 * @author zhr
 * Student实体
 */

public class Student {
	
	private String student_ID;
	
	private String student_sex;
	
	private String student_admissionDate;
	
	private PersonInfo student_personInfo;
	
	private ScoreList scoreList;
	
	public Student(
			String student_ID, String student_sex, String student_admissionDate, PersonInfo student_personInfo, ScoreList scoreList
			) {
		this.student_ID = student_ID;
		this.student_sex = student_sex;
		this.student_admissionDate = student_admissionDate;
		this.student_personInfo = student_personInfo;
		this.scoreList = scoreList;
	}
	
	public String getStudent_ID() {
		return this.student_ID;
	}
	
	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}
	
	public String getStudent_Sex() {
		return this.student_sex;
	}
	
	public void setStudent_Sex(String student_sex) {
		this.student_sex = student_sex;
	}
	
	public String getStudent_AdmissionDate() {
		return this.student_admissionDate;
	}
	
	public void setStudent_AdimissionDate(String student_admissionDate) {
		this.student_admissionDate = student_admissionDate;
	}
	
	public PersonInfo getStudent_PersonInfo() {
		return this.student_personInfo;
	}
	
	public void setStudent_PersonInfo(PersonInfo student_personInfo) {
		this.student_personInfo = student_personInfo;
	}
	
	public ScoreList getScoreList() {
		return this.scoreList;
	}
	
	public void setScoreList(ScoreList scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
