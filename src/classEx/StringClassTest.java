package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
// String Ŭ���� ���� ��������
	public static void main(String[] args) throws ClassNotFoundException{
		// 1. Ŭ���� �̸� �Է��ؼ�~~~~~ String class ��������
//		Class strClass = Class.forName("java.lang.String");
		
		// 2. ���� class ���� �����ؼ�~~~ String class ��������
//		Class strClass = String.class;
		
		// 3. Object�� getClass()�޼��� ����ؼ�~~~ String class ��������
		String str = new String("");
		Class strClass = str.getClass();
		strClass.getClass();
		System.out.println("strClass: " + strClass);
		System.out.println("str: " + str);
		
		
		System.out.println(strClass + "�� �Ұ��մϴ�");
		System.out.println();
		
		// ��� ������ ��������
		System.out.println("------ ��� ������ �������� ------- ");
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println("c: " + c);
		}
		
		// ��� ��� ����(=�ʵ�) ��������
		System.out.println();
		System.out.println("------ ��� ��� ����(=�ʵ�) �������� ------- ");
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println("f: " + f);
		}
		
		// ��� �޼��� ��������
		System.out.println();
		System.out.println("------ ��� �޼��� �������� ------- ");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println("m: " + m);
		}
	}

}
