package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// Powder������ GenericPrinter Ŭ���� ����
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);

		// Plastic������ GenericPrinter Ŭ���� ����
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
