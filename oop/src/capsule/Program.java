package capsule;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		ExamList list = new ExamList(); 
		ExamList.init(list);
		
		
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			menu = inputMenu();
			switch (menu) {
			case 1:
				ExamList.inputList(list);
				break;
			case 2:
				ExamList.printList(list);
				ExamList.printList(list, 2);
				break;
			case 3:
				keepLoop = false;
				break;
			}
		}
	}

	

	static int inputMenu() {
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
