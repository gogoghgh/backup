package GUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx extends JFrame {
	// JFrame,, 화면에 보여지는 판떼기!! (menu bar 영역 + content pane 영역으로 구성되어 있음)
	MouseListenerEx() {
		// 생성자에 이 4가지 넣기~!! 기본 기본
		// 1.setTitle   2.setDefaultCloseOperation   3.setSize   4.setVisible
		setTitle("테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // jframe X 버튼 누르면~~ // 걍 JFrame. 안 하고 바로 해도 ㅇㅋ?
		JPanel panel = new JPanel(); // frame 위에 panel로 덧씌우는,,,
		JLabel lbl = new JLabel("같이 가요~~~"); // frame 위에 -> panel 위에 -> label 갖다 붙이기
											// 내부적으로 final인 변수임... 값 못 바꿈 .... 
											// 익명 클래스에서 지역변수 사용할 때는 final!!! 
		panel.addMouseListener(new MouseListener() {  // 익명 클래스로 MouseListener 인터페이스 구현,,
							// new MouseAdapter() -> 하면 안 쓰는 메서드들 안 적어도 됨 
			@Override
			public void mousePressed(MouseEvent e) {
				//마우스로 누르면? 사용자가 클릭한 위치를 알아오기(OS가 정보 제공해줌)!!
				int x = e.getX(); // 사용자가 누른(press) x값 좌표 알아와서 -> int x 변수에 대입
				int y = e.getY(); // 사용자가 누른(press) y값 좌표 알아와서 -> int y 변수에 대입
				lbl.setLocation(x, y); // OS로부터 넘겨받은 x, y값을 -> 우리가 만든 label 위치에 대입
										// 그러면 마우스로 클릭하는 곳으로 글자 label이 따라다님`~~
			}
			// 안 쓰는 메서드들 ^^;; 
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}			
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});  // addMouseListener 메서드 끝
		setContentPane(panel);
		setLayout(null); 
			// null 레이아웃인 경우에는, 절댓값 좌표(setLocation)와 크기(setSize) 일일이 정해줘야 함!! 
			// 귀찮지만,, 장점: 동적인 위치 설정 가능
		lbl.setLocation(50, 50); // 절댓값 좌표
		lbl.setSize(100, 20); // label 크기
		panel.add(lbl);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MouseListenerEx();

	}// main
}// MLE class