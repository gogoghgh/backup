package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerSample extends JFrame {

	ListenerSample() {
		setTitle("샘플 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		// ㄴ이렇게가 필수 4가지!!

		setLayout(new FlowLayout()); // flow layout: 순차적으로,, frame에 add하는 만큼 쭉~~~ 늘어남
//		add(new JButton("빨"));
//		add(new JButton("주"));
//		add(new JButton("노"));
//		add(new JButton("초"));
//		add(new JButton("파"));
//		add(new JButton("남"));
//		add(new JButton("보"));

		JButton btn1 = new JButton("Action");

		add(btn1);

		// 버튼에다가 이 액션 리스너를 부착하겠다~ add하겠다~
		btn1.addActionListener(new ActionListener() { // 4. 익명 내부 클래스 써서 바로 구현!!
														// actionlistener 인터페이스 ctrl space 하니까 바로 틀 나오네,,
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = btn1.getText(); // btn1은 지역변수,, btn1이 갖고 있는 text값을 가지고 옴
				if (s.equals("Action")) {
					btn1.setText("액션...^^");
				} else
					btn1.setText("Action");
//				System.out.println("s: " + s);
			}
		});

	}

	public static void main(String[] args) {
		new ListenerSample();
	}

}
