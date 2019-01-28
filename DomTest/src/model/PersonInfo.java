package model;

/**
 * 
 * @author zhr
 * personInfo实体
 */
public class PersonInfo {
	private String personInfo_name;	//姓名
	
	private String personInfo_sex;	//性别
	
	private String personInfo_birthday;	//出生日期
	
	private Department personInfo_department;	//所属部门
	
	public PersonInfo(String personInfo_name, String personInfo_sex, String personInfo_birthday, Department personInfo_department) {
		this.personInfo_name = personInfo_name;
		this.personInfo_sex = personInfo_sex;
		this.personInfo_birthday = personInfo_birthday;
		this.personInfo_department = personInfo_department;
	}
	
	public String getPersonInfo_Name() {
		return this.personInfo_name;
	}
	
	public void setPersonInfo_Name(String personInfo_name) {
		this.personInfo_name = personInfo_name;
	}
	
	public String getPersonInfo_Sex() {
		return this.personInfo_sex;
	}
	
	public void setPersonInfo_Sex(String personInfo_sex) {
		this.personInfo_sex = personInfo_sex;
	}
	
	public String getPersonInfo_Birthday() {
		return this.personInfo_birthday;
	}
	
	public void setPersonInfo_Birthday(String personInfo_birthday) {
		this.personInfo_birthday = personInfo_birthday;
	}
	
	public Department getPersonInfo_Department() {
		return this.personInfo_department;
	}
	
	public void setPersonInfo_Department(Department personInfo_department) {
		this.personInfo_department = personInfo_department;
	}
}
