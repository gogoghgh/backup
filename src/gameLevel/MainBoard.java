package gameLevel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); // ó�� �����ϸ� BeginnerLevel
		player.play(1);
		System.out.println();
		
		AdvancedLevel aLevel = new AdvancedLevel(); //�߷�
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
		
		JLabel jl = new JLabel("��� �ű��ϴ�!!!!!");
		jl.setBackground(Color.blue); // ���� ����
		jl.setForeground(Color.white); //���ڻ� ����
		jl.setOpaque(true); //true�� �������� ������ ������ �ݿ����� ����
		
		jf.add(jl);
		jf.pack();
		jf.setVisible(true);
		
	}

}
