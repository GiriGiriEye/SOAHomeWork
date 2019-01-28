package model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 
 * @author zhr
 * department实体
 */

public class Department {
	
	private int department_number;	//部门编号
	
	private String department_name;	//部门名称
	
	private String department_classifiedType;	//部门类别类型
	
	
	public Department(int department_number, String department_name, String department_classifiedType) {
		this.department_number = department_number;
		this.department_name = department_name;
		this.department_classifiedType = department_classifiedType;
	}
	
	@XmlAttribute(name="部门编号")
	public int getDepartment_Number() {
		return this.department_number;
	}
	
	public void setDepartment_Number(int department_number) {
		this.department_number = department_number;
	}
	
	@XmlAttribute(name="部门名称")
	public String getDepartment_Name() {
		return this.department_name;
	}
	
	public void setDepartment_Name(String department_name) {
		this.department_name = department_name;
	}
	
	@XmlAttribute(name="部门类别")
	public String getDepartment_ClassifiedType() {
		return this.department_classifiedType;
	}
	
	public void setDepartment_ClassifiedType(String department_classifiedType) {
		this.department_classifiedType = department_classifiedType;
	}
	
}
