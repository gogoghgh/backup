package exception;

public class PasswordTest {
	private String userPW;

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) throws PasswordException {
		if (userPW == null) {
			throw new PasswordException("pw는 null일 수 없습니다");
		} else if (userPW.length() < 5) {
			throw new PasswordException("pw는 5자 이상으로 써주삼");
		} else if (userPW.matches("[a-zA-Z]+")) { // 정규식~~ [a-zA-Z0-9ㄱ-ㅎ]
			throw new PasswordException("문자만 쓸 수 없삼");
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