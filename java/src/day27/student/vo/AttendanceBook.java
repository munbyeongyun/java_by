package day27.student.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class AttendanceBook{

	private List<Attendance> list = new ArrayList<>();
	private List<Student> stdList = new ArrayList<>();
	public boolean insertStudent(Student std) {
		//이미 등록된 학번이면 등록 실패 : 학생 클래스가 학번을 통해서 같은지 확인할수 있어야 함.
		if(stdList.contains(std)) {
			return false;
		}
		//새학생을 추가
		stdList.add(std);
		
		//학번순으로 정렬
		Collections.sort(stdList,(o1,o2)-> {
			return o1.getNum().compareTo(o2.getNum());
		});
		return true;
	}
}
