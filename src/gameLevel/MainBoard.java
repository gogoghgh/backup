package gameLevel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); // 처음 생성하면 BeginnerLevel
		player.play(1);
		System.out.println();
		
		AdvancedLevel aLevel = new AdvancedLevel(); //중렙
		player.upgradeLevel(aLevel);
		player.play(2);
		System.out.println();
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		System.out.println("------------------------------ Color-----");
		JFrame jf = new JFrame("MyJFrame");
		Dimension dimension = new Dimension(300, 100);
		jf.setPreferredSize(dimension);
		jf.setLocation(1, 1);
		
		JLabel jl = new JLabel("대박 신기하다!!!!!");
		jl.setBackground(Color.blue); // 배경색 지정
		jl.setForeground(Color.white); //글자색 지정
		jl.setOpaque(true); //true로 설정하지 않으면 색상이 반영되지 않음
		
		jf.add(jl);
		jf.pack();
		jf.setVisible(true);
		
	}

}
