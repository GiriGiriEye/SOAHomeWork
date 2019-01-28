package main;

import java.util.List;
import java.util.ArrayList;
import model.*;


/**
 * 
 * @author zhr
 * 在这里输入学生的静态数据
 */
public class StudentFactory {
	private static Department department = new Department(250,"软件学院","院系专业");
	
	public static Student getStudentOne() {
		PersonInfo personInfo = new PersonInfo("刘天尺","男","1998-05-18",department);
		CourseGrade cg1 = new CourseGrade("平时成绩",25000010,new Grade("161250077",100));
		CourseGrade cg2 = new CourseGrade("作业成绩",25000011,new Grade("161250077",90));
		CourseGrade cg3 = new CourseGrade("期中成绩",25000012,new Grade("161250077",80));
		CourseGrade cg4 = new CourseGrade("期末成绩",25000013,new Grade("161250077",70));
		CourseGrade cg5 = new CourseGrade("总评成绩",25000014,new Grade("161250077",50));
		List<CourseGrade> list = new ArrayList<CourseGrade>();
		list.add(cg1);
		list.add(cg2);
		list.add(cg3);
		list.add(cg4);
		list.add(cg5);
		ScoreList scoreList = new ScoreList(list);
		
		Student student = new Student("161250077","男","2016-09-01",personInfo,scoreList);
		
		return student;
	}
	
	public static Student getStudentTwo() {
		PersonInfo personInfo = new PersonInfo("赵鸿儒","男","1997-03-27",department);
		CourseGrade cg1 = new CourseGrade("平时成绩",25000010,new Grade("151250198",100));
		CourseGrade cg2 = new CourseGrade("作业成绩",25000011,new Grade("151250198",90));
		CourseGrade cg3 = new CourseGrade("期中成绩",25000012,new Grade("151250198",80));
		CourseGrade cg4 = new CourseGrade("期末成绩",25000013,new Grade("151250198",70));
		CourseGrade cg5 = new CourseGrade("总评成绩",25000014,new Grade("151250198",50));
		List<CourseGrade> list = new ArrayList<CourseGrade>();
		list.add(cg1);
		list.add(cg2);
		list.add(cg3);
		list.add(cg4);
		list.add(cg5);
		ScoreList scoreList = new ScoreList(list);
		
		Student student = new Student("151250198","男","2015-09-01",personInfo,scoreList);
		
		return student;
	}
}
