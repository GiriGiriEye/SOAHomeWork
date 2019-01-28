package main;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

import model.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import org.w3c.dom.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * 
 * @author zhr
 * DOM生成XML
 */
public class DomTest {
	private static Department d = new Department(250,"软件学院","院系专业");
	
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub
		
		//创建DocumentBuilderFactory对象
		//通过DocumentBuilderFactory对象创建DocumentBuilder对象
		//通过DocumentBuilder对象的newDocument()方法创建一个Document对象，该对象代表一个XML文件
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument(); 
		
		//创建根节点 ：学生列表，并设置命名空间，命名空间前缀
		Element studentList = document.createElementNS("http://jw.nju.edu.cn/schema","学生列表");
		studentList.setPrefix("tns");
		document.appendChild(studentList);
		
		
		//从学生Factory里取静态对象
		Element student1 = createStudent(document, StudentFactory.getStudentOne());
		Element student2 = createStudent(document, StudentFactory.getStudentTwo());
		studentList.appendChild(student1);
		studentList.appendChild(student2);
		
		//创建Transformer，并设置xml换行和utf-8编码
		TransformerFactory tff = TransformerFactory.newInstance();
		Transformer tf = tff.newTransformer();
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		tf.setOutputProperty("encoding", "utf-8");
		
		//生成XML文件
		DOMSource domSource = new DOMSource(document);

        StreamResult sr = new StreamResult(new File("src/xml/文档2.xml"));
        tf.transform(domSource, sr); 
		
	}
	
	//下面全是生成element的方法
	//setTextContent(String)是给节点添加具体内容的
	//setAttribute(string,string)是设置节点的属性，前一个参数是属性名，后一个是具体值
	//appendChild是添加子节点
	private static Element createStudent(Document document, Student s) {
		Element student = document.createElement("学生");
		
		Element student_ID = document.createElement("学号");
		student_ID.setTextContent(s.getStudent_ID());
		
		Element student_admissionDate = document.createElement("入学时间");
		student_admissionDate.setTextContent(s.getStudent_AdmissionDate());
		
		PersonInfo p = s.getStudent_PersonInfo();
		Element student_personInfo = createPersonInfo(document, p.getPersonInfo_Name(), p.getPersonInfo_Sex(), p.getPersonInfo_Birthday());
		
		
		List<CourseGrade> courseGradeList = s.getScoreList().getScoreList();
		List<Element> courseGradeElementList = new ArrayList<Element>();
		CourseGrade cg;
		for(int i = 0; i < courseGradeList.size(); i++) {
			cg = courseGradeList.get(i);
			courseGradeElementList.add(createCourseGrade(document, cg.getCourseGrade_property(), cg.getCourseGrade_Number(), cg.getCourseGrade_Grade()));
		}
		
		
		Element student_scoreList = createScoreList(document, courseGradeElementList);
		
		student.appendChild(student_ID);
		student.appendChild(student_admissionDate);
		student.appendChild(student_personInfo);
		student.appendChild(student_scoreList);
		
		return student;
	}
	
	private static Element createScoreList(Document document, List<Element> courseGradeList) {
		Element scoreList = document.createElement("课程成绩列表");
		if(courseGradeList.get(0) != null) {
			for(int i = 0; i < courseGradeList.size(); i++) {
				scoreList.appendChild(courseGradeList.get(i));
			}
		}
		
		return scoreList;
		
	}
	
	private static Element createPersonInfo(Document document, String name, String sex, String birthday) {
		PersonInfo p = new PersonInfo(name,sex,birthday,d);
		
		Element personInfo = document.createElement("个人基本信息");
		
		Element personInfo_name = document.createElement("姓名");
		personInfo_name.setTextContent(name);
		
		Element personInfo_sex = document.createElement("性别");
		personInfo_sex.setTextContent(sex);
		
		Element personInfo_birthday = document.createElement("出生日期");
		personInfo_birthday.setTextContent(birthday);
		
		Element department = createDepartment(document);
		
		personInfo.appendChild(personInfo_name);
		personInfo.appendChild(personInfo_sex);
		personInfo.appendChild(personInfo_birthday);
		personInfo.appendChild(department);
		
		return personInfo;
	}
	
	private static Element createGrade(Document document, Grade grade) {
		Element g = document.createElement("成绩");
		
		Element student_ID = document.createElement("学号");
		student_ID.setTextContent(grade.getStudent_ID());
		
	    Element student_grade = document.createElement("得分");
		student_grade.setTextContent(String.valueOf(grade.getGrade()));
		
		g.appendChild(student_ID);
		g.appendChild(student_grade);
		
		return g;
	}
	
	private static Element createCourseGrade(Document document, String property, int number, Grade grade) {
		Element courseGrade = document.createElement("课程成绩");
		courseGrade.setAttribute("成绩性质", property);
		courseGrade.setAttribute("课程编号", String.valueOf(number));
		
		Element g = createGrade(document, grade);
		
		courseGrade.appendChild(g);
		
		return courseGrade;
	}
	
	private static Element createDepartment(Document document) {
		Department d = new Department(250,"软件学院","院系专业");
		
		Element department = document.createElement("所属部门");
		
		Element department_number = document.createElement("部门编号");
		department_number.setTextContent(String.valueOf(d.getDepartment_Number()));
		
		Element department_name = document.createElement("部门名称");
		department_name.setTextContent(d.getDepartment_Name());
		
		Element department_type = document.createElement("部门类别");
		department_type.setTextContent(d.getDepartment_ClassifiedType());
		
		department.appendChild(department_number);
		department.appendChild(department_name);
		department.appendChild(department_type);
		
		return department;
	}

}
