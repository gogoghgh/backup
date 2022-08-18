package exception;

public class PasswordTest {
	private String userPW;

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) throws PasswordException {
		if (userPW == null) {
			throw new PasswordException("pw�� null�� �� �����ϴ�");
		} else if (userPW.length() < 5) {
			throw new PasswordException("pw�� 5�� �̻����� ���ֻ�");
		} else if (userPW.matches("[a-zA-Z]+")) { // ���Խ�~~ [a-zA-Z0-9��-��]
			throw new PasswordException("���ڸ� �� �� ����");
		}
		this.userPW = userPW;
	}

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();

		String userPW = null;
		try {
			test.setUserPW(userPW);
		} catch (PasswordException e) {
			System.out.println("e.getMessage: " + e.getMessage());
		}

		userPW = "1234";
		try {
			test.setUserPW(userPW);
		} catch (PasswordException e) {
			System.out.println("e.getMessage: " + e.getMessage());
		}

		userPW = "aaaaa";
		try {
			test.setUserPW(userPW);
		} catch (PasswordException e) {
			System.out.println("e.getMessage: " + e.getMessage());
		}

	}

}