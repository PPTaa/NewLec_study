package 추상화;

import java.util.Scanner;

public abstract class ExamConsole {
	
	// Composition Has A (일체형)
	private ExamList list = new ExamList();
	
	public void print() {
		print(list.size());
	}

	public void print(int size) {
		System.out.println("============================");
		System.out.println("성적출력");
		System.out.println("============================");

		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);// this.exams[i];

			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();
			float avg = exam.avg();

			System.out.printf("국어: %3d\n", kor);
			System.out.printf("영어: %3d\n", eng);
			System.out.printf("수학: %3d\n", math);

			System.out.printf("총점: %3d\n", total);
			System.out.printf("평균: %6.3f\n", avg);

			System.out.println("============================");

		}

	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("============================");
		System.out.println("성적입력");
		System.out.println("============================");

		int kor, eng, math;

		do {
			System.out.print("국어: ");
			kor = scanner.nextInt();
			if (kor < 0 || kor > 100) {
				System.out.println("성적은 0~100 범위만 입력홰주세요");
			}
		} while (kor < 0 || kor > 100);
		do {
			System.out.print("영어: ");
			eng = scanner.nextInt();
			if (eng < 0 || eng > 100) {
				System.out.println("성적은 0~100 범위만 입력홰주세요");
			}
		} while (eng < 0 || eng > 100);
		do {
			System.out.print("수학: ");
			math = scanner.nextInt();
			if (math < 0 || math > 100) {
				System.out.println("성적은 0~100 범위만 입력홰주세요");
			}
		} while (math < 0 || math > 100);

		System.out.println("============================");
//		Exam exam = new Exam(kor, eng, math);
		Exam exam = makeExam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		// ------------------add-------------------------
		
		list.add(exam);
	}

	protected abstract Exam makeExam();
}
