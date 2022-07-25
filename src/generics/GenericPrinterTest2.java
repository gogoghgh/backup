package generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
		
		//��� ���� ���� Water Ŭ������ ���, 
		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		// ������ �߳׿�.. 
		// Bound mismatch: The type Water is not a valid substitute for the bounded parameter <T extends Material> of the type GenericPrinter<T>
	}

}
