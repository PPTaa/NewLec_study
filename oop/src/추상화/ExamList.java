package 추상화;

public class ExamList {
	private Exam[] exams;
	private int current;

	public ExamList() {
		this(3);
	}
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
	}
	public Exam get(int i) {
		return this.exams[i];
	}
	public void add(Exam exam) {

		Exam[] exams = this.exams;
		int size = this.current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size + 5];
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			exams = temp;
		}
		exams[current] = exam;
		current++;
	}

	public int size() {
		return current;
	}
}
