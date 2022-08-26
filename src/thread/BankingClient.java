package thread;

public class BankingClient {
	///////////////// 메인 /////////////////////
	public static void main(String[] args) {
		Account account = new Account(5000);
		WithdrawThread iBanking = new WithdrawThread("인터넷뱅킹", account, 1000);
		WithdrawThread mBanking = new WithdrawThread("모바일뱅킹", account, 1000);
		DepositThread tBanking = new DepositThread("텔레뱅킹", account, 10000);
		
		iBanking.start();
		mBanking.start();
		tBanking.start();
	}

}

////////////////////////////////////////////////
class Account {
	int balance;

	// 생성자
	public Account(int balance) {
		this.balance = balance;
	}

	// 메서드(출금)
//	public int withdraw(int money) {  // 구
	public synchronized int withdraw(int money) { // 신: synchronized 추가
		String threadName = Thread.currentThread().getName();
		if (balance >= money) {
			try {
				Thread.sleep(3000); // 3초마다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
			System.out.println(threadName + " 출금 잔액 : " + balance);
		} else {
			System.out.println(threadName + " : 잔액 부족,, wait() 호출 ");

			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // t-c
		}
		return balance;
	}// withdraw()

	// 메서드(입금)
	public int deposit(int money) {
		String threadName = Thread.currentThread().getName();

		balance += money;

		this.notifyAll();
		System.out.println(threadName + ": " + money + "원 입금 /  잔액: " + balance);
		return balance;
	}

}// Account class

//////////////////////////////////////////////////
// 스레드~~~~~~
class WithdrawThread extends Thread {
	Account account; // Account class 타입의 변수 account
	int money;
	boolean flag = true;

	// 생성자
	public WithdrawThread(String name, Account account, int money) {
		super(name);
		this.account = account;
		this.money = money;
		System.out.println(name + " : " + money + "원 출금합니다");
	}

	@Override
	public void run() {
		for (int i = 0; i < 6 || flag; i++) {
			// 최소 6번은 돌게 됨
			int balance = account.withdraw(money);
			if (balance <= money) // 잔액이 뽑는 돈보다 적으면,
				flag = false; // 멈춰라!!
		}
	}
} // WithdrawThread

/////////////////////////////////////////////////////
class DepositThread extends Thread {
	Account account;
	int money;

	DepositThread(String name, Account account, int money) {
		super(name);
		this.account = account;
		this.money = money;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		account.deposit(money);
	}
} // DepositThread
