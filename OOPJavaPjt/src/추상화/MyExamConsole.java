package 추상화;

import java.util.Scanner;

public class MyExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		return new MyExam();
	}

	@Override
	protected void onInput(Exam exam) {
		Scanner scanner = new Scanner(System.in);
		MyExam myExam = (MyExam) exam;
		int com;
		do {
			System.out.print("컴퓨터: ");
			com = scanner.nextInt();
			if (com < 0 || com > 100) {
				System.out.println("성적은 0~100 범위만 입력홰주세요");
			}
		} while (com < 0 || com > 100);
		
		myExam.setCom(com);
	}

	@Override
	protected void onPrint(Exam exam) {
		MyExam myExam = (MyExam)exam;
		int com = myExam.getCom();
		System.out.printf("컴퓨터: %2d\n", com);
		
	}
	
}
