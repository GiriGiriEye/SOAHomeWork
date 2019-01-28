package model;

import java.util.List;

public class ScoreList {
	
	private List<CourseGrade> scoreList;
	
	public ScoreList(List<CourseGrade> scoreList) {
		this.scoreList = scoreList;
	}
	
	public List<CourseGrade> getScoreList(){
		return this.scoreList;
	}
	
	public void setScoreList(List<CourseGrade> scoreList) {
		this.scoreList = scoreList;
	}
}
