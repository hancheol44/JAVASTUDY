package day14;

/**
 * �� Ŭ������ JButton�� �̺�Ʈ ó���� �� �� ����ϴ� ���� ���� Ŭ������ ������ �����ϴ�
 * ������ Ŭ����
 * 
 * @author  ����ö
 * @since	2020.03.26
 * @version v.1.0
 * @see 
 * 			JFrame, JPannel, JButton, ActionListener
 * 	
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorWin {
	/*
	 	�ڹٿ��� GUI �� ���� �� �ִ� ������ ������ �ϰ� �ִµ�
	 	javax.swing ��Ű���� java.awt ��Ű�� �̴�.
	 	
	 	�� Ŭ���������� Windows�� â�� ������ִ� JFrame �� ����ؼ� â�� �����
	 	���ο� JPanel�� �̿��ؼ� ä����
	 	JPannel�� ������ �����ϰ� 
	 	�׸��� JButton�� ����� �ο��غ���.
	 */
	
	// ����� ��� ���������� ����
	// ������ new ���Ѽ� �� Ŭ������ �Լ����� ����Ҷ�
	// �Լ����� ������ �����ϸ� �ܺο��� ������ ����� ���⶧��
	JFrame frame;
	JPanel pan1, pan2;
	JButton cBtn, eBtn, tBtn;
	
	public ColorWin() {
		// ���� �ʱ�ȭ
		// frame ��ü ����� �ְ�
		frame = new JFrame();
		
		// frame â�� x ��ư ������ �����ϴ� ��� �ο�
		// ���� �ʰ� �Ǹ� â�� ����� ���α׷��� �ܼ�â���� ��� ���ư�����...
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("�ƹ��͵� �ƴմϴ�!");
		
		// �� ����
		pan1 = new JPanel();
		pan1.setBackground(Color.PINK);
		pan2 = new JPanel();
		pan2.setBackground(Color.PINK);
		
		// ��ư ����
		cBtn = new JButton("Color");
		eBtn = new JButton("EXIT");
		tBtn = new JButton("Title");
		
		// ???  2 
		// �̺�Ʈ ��ü �����
		TitleEvt evt1 = new TitleEvt(this);
//		TitleEvt evt2 = new TitleEvt(new ColorWin());   this�� ��Ī�� new ColorWin(); ����������
//														new �� ���ǵǴ¼��� ���ο� �ν��Ͻ��� ����� �ǹǷ�
//														���� �ٸ� ��ü�ΰ��̴�.
		// tBtn�� �̺�Ʈ ��ü �־��ְ�
		tBtn.addActionListener(evt1);
		
		// eBtn ����
		eBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		cBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �� �Լ��� Color ��ư�� Ŭ���� �Ǹ� ����Ǵ� �Լ���
				// Į�� �����ϰ� ���� JPanel�� ������ ��������ִ� �Լ��̴�.
				
				// 1. ���� Į�� �����ϰ� �����.
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				// 2. Į���� ������Ҵ� ��������� Į�� ������.
				Color color = new Color(red,green,blue);
				
				// 3. ������� Į�� pan1, pan2���� ������.
				pan1.setBackground(color);
				pan2.setBackground(color);
			}
		});
		
		
		pan2.add(cBtn);
		pan2.add(eBtn);
		pan2.add(tBtn);
		
		
		// ������ ���� frame�� �߰��ϰ� ��ġ����    
		//(��ġ���� center ���� north,south,west,east�� �ִ�. �ֺ����� ������ ���ͼ����� ��翩���� ä���)
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);
		
		// ����� �����ϰ� 
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new ColorWin();
	
	}
	
}
// �� ����???  1
class TitleEvt implements ActionListener {
	ColorWin main;
	public TitleEvt() {}
	public TitleEvt(ColorWin main) {
		this.main = main;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� Ÿ���� �Է¹޴´�.
		/*
		String title = JOptionPane.showInputDialog("Ÿ��Ʋ�� �Է��ϼ���");
		main.frame.setTitle(title);
		*/
		
		// �� �ڵ带 ����
		main.frame.setTitle(JOptionPane.showInputDialog("Ÿ��Ʋ�� �Է��ϼ���"));
	}
	
}





