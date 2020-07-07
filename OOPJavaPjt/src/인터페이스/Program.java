package 인터페이스;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		FileInputStream file = new FileInputStream("src/인터페이스/setting.txt");
		Scanner scanner = new Scanner(file);
		String className = scanner.nextLine();
		System.out.println(className);
		scanner.close();
		file.close();
		
		Class clazz = Class.forName(className);
		
		A a = new A();
		X b = (X) clazz.newInstance();
		
		a.setX(b);
		a.print();
	
	}
}
