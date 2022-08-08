package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Stream API Ȱ��
<����>
�Ʒ� ���� �޴� ���ڿ����� �����ߣ��� �� �ִ� ���� �޴��� ��� ȭ�鿡 ǥ���Ͻÿ�
"��̹� �ǻ���ƿ� �񿣳��ߺ��� �ܹ������߹�ħ ��α� ȣ�нĻ� ũ������ ������&���� �Ƹ޸�ī�� ������"*/

public class Quiz {

	public static void main(String[] args) {
		String string1 = "��̹� �ǻ���ƿ� �񿣳��ߺ��� �ܹ������߹�ħ ��α� ȣ�нĻ� ũ������ ������&���� �Ƹ޸�ī�� ������";
		List<String> result = Arrays.asList(string1.split(" ")).stream()
													// ���� �������� �ɰ���~ �ܾ��� ������
									// asList: arrayList�� �ٲ��ش�,,? -> �� ����,, stream ����
//							.filter((s)->s.contains("����")).forEach(s->System.out.println(s)); 
							.filter((s)->s.contains("����")).collect(Collectors.toList());
							// �߰� ó�� �޼���: filter 			// Collectors: �ٽ� list�� ������ִ� ���̺귯��,,

		for(String s : result) System.out.println(s);

	}

}
