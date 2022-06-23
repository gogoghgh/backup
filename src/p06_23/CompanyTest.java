package p06_23;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		// private한 Company지만 static 메서드니까 노상관?
		System.out.println(myCompany1 == myCompany2);
	}

}
