package p06_23;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		// private�� Company���� static �޼���ϱ� ����?
		System.out.println(myCompany1 == myCompany2);
	}

}
