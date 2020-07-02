package 코드재사용;
import UI코드분리하기.Exam;

public class Program {
	
//  1. 컴파일 -> Exam.class
//	2. 압축 -> Exam.zip
//	3. jar -> Exam.jar
	
	public static void main(String[] args)  {
//		jar 파일을 임포트 하여 재사용
		MyExam exam = new MyExam();
		MyExam exam1 = new MyExam(10,20,30,40);
		Exam exam2 = new MyExam(4, 4, 4, 4);
		
		exam.setEng(1);
		exam.setMath(2);
		exam.setKor(3);
		exam.setCom(4);
		
		
		System.out.println("exam = "+exam.total());
		System.out.println("exam = "+exam.avg());
		
		System.out.println("exam1 = "+exam1.total());
		System.out.println("exam1 = "+exam1.avg());
		
		System.out.println(exam2.total());
		System.out.println(exam2.avg());
		
	}
	
}

