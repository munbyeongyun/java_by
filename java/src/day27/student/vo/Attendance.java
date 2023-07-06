package day27.student.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Attendance implements Serializable{

	private static final long serialVersionUID = -1884833507830332805L;
	
	private Date date; //출석 날짜
	private Student student; //학생 정보
	private boolean attendance; //출석 여부
	
	//출석일, 학생, 출석여부를 이용한 생성자
	public Attendance(Date date, Student student, boolean attendance) {
		super();
		this.date = date;
		this.student = student;
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return student.toString() + " : " + (attendance?"O" : "X");
	}
	
}
