package 추상화;

public class MyExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		return new MyExam();
	}
	
}
