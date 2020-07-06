package 추상화;

public class MyExam extends Exam {
	
	private int com;
	
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public MyExam() {
		this(0,0,0,0);
	}
	public MyExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	@Override
	public int total() {
		int total = onTotal()+com;
		return total;
	}
	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}
}
