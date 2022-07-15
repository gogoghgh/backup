package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");

		int ch = System.in.read();
		        //System Ŭ���� �� static ������� in �� in�� InputStream class type,, 
				// �� read() �޼��� ���� ����(8��Ʈ�� �����͸� �о�´�)
		Sort sort = null; // �ʱⰪ = null

		if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�...�Ф� ���~~ ");
			return;
		}
		
		// � ���� �������~~ �� ������� 
		//  �� = QuickSort.~~ / HeapSort.~~ / BubbleSort.~~ �̷��� �� �ϰ� 
		// Sort.~~~ �� �ѹ濡!! ����� �޼��� ȣ���� �� ����^^
		int[] arr = new int[10];  // ���: ����,, �츮�� arr ������ �ʴµ� �� ���ϱ�,,, 
		sort.ascending(arr);      // ��: ���赵���~~ �ϴ� ���� ��~~ ���� �� ������� �� �ƴ�����,, �� ���ư��� ������ ����(println) ���� ��,,,  '����' ��������!!
		sort.descending(arr);
		sort.description();
		
	} //main

}
