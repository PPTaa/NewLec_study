package 추상화;

public class Program {

	public static void main(String[] args) {
//		MyExam exam = new MyExam();
//		System.out.println(exam.total());
		
		ExamConsole console = new MyExamConsole();
		console.input();
		console.print();
	}

}
