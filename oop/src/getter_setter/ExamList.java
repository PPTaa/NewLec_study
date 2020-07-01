package getter_setter;

import java.util.Scanner;

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
	
	public void printList() {		
		printList(current);
	}
	
	public void printList(int size) {
		System.out.println("============================");
		System.out.println("성적출력");
		System.out.println("============================");
		
		Exam[] exams = this.exams;
		
		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			
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

	public void inputList() {
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
				
		Exam exam = new Exam(kor, eng, math);
		
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
}
