package Datastructure;

import java.util.Scanner;

public class ListProgram {
	public static void main(String[] args) {
		
		ExamList list = new ExamList(); 
		list.exams = new Exam[3];
		list.current = 0;

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			menu = inputMenu();
			switch (menu) {
			case 1:
				inputList(list);
				break;
			case 2:
				printList(list);
//				printList(list, 2);
				break;
			case 3:
				keepLoop = false;
				break;
			}
		}
	}

	private static void printList(ExamList list) {		
		printList(list, list.current);
	}
	
	private static void printList(ExamList list, int size) {
		System.out.println("============================");
		System.out.println("성적출력");
		System.out.println("============================");
		
//		int size = list.current;
		Exam[] exams = list.exams;
		
		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			float avg = total / 3.0f;

			System.out.printf("국어: %3d\n", kor);
			System.out.printf("영어: %3d\n", eng);
			System.out.printf("수학: %3d\n", math);

			System.out.printf("총점: %3d\n", total);
			System.out.printf("평균: %6.3f\n", avg);

			System.out.println("============================");

		}

	}

	private static void inputList(ExamList list) {
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

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;
		
		if (exams.length == size) {
			Exam[] temp = new Exam[size + 5];
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			list.exams = temp;
		}
		list.exams[list.current] = exam;
		list.current++;
	}

	private static int inputMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int menu = scanner.nextInt();

		return menu;
	}
}
