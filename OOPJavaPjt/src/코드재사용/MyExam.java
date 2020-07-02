package 코드재사용;

import UI코드분리하기.Exam;

public class MyExam extends Exam{
	private int com;
	
	public MyExam() {
		this(0, 0, 0, 0);
	}
	
	public MyExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
//	total 수정
	@Override
	public int total() {
		return super.total()+com;
	}
	
	@Override
	public float avg() {
		return total()/4.0f;
	}
	
	public int perfect() {
		return 400;
	}
}
