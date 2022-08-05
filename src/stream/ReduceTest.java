package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator �������̽��� ������ Ŭ���� ����
class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		// reduce() �޼��尡 ȣ��� �� �Ҹ��� �޼���(apply)
		// �� ���ڿ�(s1, s2) ���̸� ���ؼ� �� �� �� ����
		if (s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;

		// ���׿����ڷε� �ǰڱ�
	}

}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = { "�ȳ��ϼ���~~~~", "hello", "Good morning", "�氡�氡~~~~~~~~~~~~~" };
		System.out.println(Arrays.stream(greetings)
			.reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));
		
		// BinaryOperator�� ������ Ŭ���� ���
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println("�� �� ��: " + str);
			// reduce() �����ε�,, �Ű������� Ŭ������ ����~~ reduce��, ����Ÿ���� Optional<T>
			// Optional type -> java.util.Optional -> �ֿ� �޼���: get(), ifPresent(), orElse()....
			// get() ctrl ������ declaration ���� 
	}
}
