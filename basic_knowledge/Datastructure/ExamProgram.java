package Datastructure;

import java.util.Scanner;

public class ExamProgram {
    public static void main(String[] args) {
        Exam exam = new Exam();
        
        input(exam);
        print(exam);
        
    
    }

	private static void print(Exam exam) {
		System.out.println("성적출력");
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = kor + eng+math;
		float avg = total/3.0f;
		
		System.out.printf("국어: %3d\n",kor);
		System.out.printf("영어: %3d\n",eng);
		System.out.printf("수학: %3d\n",math);
		
		System.out.printf("총점: %3d\n",total);
		System.out.printf("평균: %6.3f\n",avg);
	}

	private static void input(Exam exam) {
		System.out.println("성적입력");
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math;
		
		do {
			System.out.print("국어: ");
			kor = scanner.nextInt();
			if (kor<0 || kor>100) {
				System.out.println("성적은 0~100 범위만 입력홰주세요");
			}
		} while (kor<0||kor>100);
		do {
			System.out.print("영어: ");
			eng = scanner.nextInt();
			if (eng<0 || eng>100) {
				System.out.println("성적은 0~100 범위만 입력홰주세요");
			}
		} while (eng<0||eng>100);
		do {
			System.out.print("수학: ");
			math = scanner.nextInt();
			if (math<0 || math>100) {
				System.out.println("성적은 0~100 범위만 입력홰주세요");
			}
		} while (math<0||math>100);
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = new Exam[3];
		
	}
}