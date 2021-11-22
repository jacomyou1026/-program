package day38;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PuzzleGame extends JFrame implements ActionListener {
	JButton[] puzzle = new JButton[16];
	JButton startButton = new JButton("섞기");
	JPanel puzzlePanel = new JPanel(new GridLayout(4, 4));
	String[] number = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" };
	Random random = new Random();

	Image[] arImg = new Image[16];

	public PuzzleGame() {
		setTitle("PuzzleGame");
		setBounds(800, 100, 800, 930);

		for (int i = 0; i < arImg.length; i++) {
			String filename = String.format("./src/img/%02d.jpg", i + 1);
			arImg[i] = Toolkit.getDefaultToolkit().getImage(filename);
		}

		// 퍼즐을 보여주는 기능
		viewPuzzle();

		startButton.setPreferredSize(new Dimension(300, 100));
		startButton.setFont(new Font("D2Coding", Font.BOLD, 50));
		startButton.addActionListener(this);
		add(startButton, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private void viewPuzzle() {
		for (int i = 0; i < puzzle.length; i++) {
			int index = Integer.parseInt(number[i]) - 1;
			puzzle[i] = new JButton(new ImageIcon(arImg[index]));
			puzzle[i].addActionListener(this);
			puzzlePanel.add(puzzle[i]);
			puzzle[i].setName(number[i]);
			if (puzzle[i].getName().equals("16")) {
				puzzle[i].setVisible(false);
			}
		}
		add(puzzlePanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("섞기")) {
			for (int i = 0; i < 10000; i++) {
				int r = random.nextInt(15) + 1;
				String temp = number[0];
				number[0] = number[r];
				number[r] = temp;
			}
		} else {
			Object obj = e.getSource();
			JButton button = (JButton) obj;

			int i;
			for (i = 0; i < puzzle.length; i++) {
				if (puzzle[i].getName().equals(button.getName())) {
					break;
				}
			}
			if (i % 4 != 0) {// 좌측 1열이 아닐 때
				if (puzzle[i - 1].getName().equals("16")) {
					String temp = number[i - 1];
					number[i - 1] = number[i];
					number[i] = temp;

					JButton tempBtn = puzzle[i - 1];
					puzzle[i - 1] = puzzle[i];
					puzzle[i] = tempBtn;

				}
				if (i % 4 != 3) {// 우측 4열이 아닐 떄
					if (puzzle[i + 1].getName().equals("16")) {
						String temp = number[i + 1];
						number[i + 1] = number[i];
						number[i] = temp;

						JButton tempBtn = puzzle[i + 1];
						puzzle[i + 1] = puzzle[i];
						puzzle[i] = tempBtn;
					}
				}
				if (i / 4 != 0) {// 상단 1행이 아닐때
					if (puzzle[i - 4].getName().equals("16")) {
						String temp = number[i - 4];
						number[i - 4] = number[i];
						number[i] = temp;

						JButton tempBtn = puzzle[i - 4];
						puzzle[i - 4] = puzzle[i];
						puzzle[i] = tempBtn;
					}
				}
				if (i / 4 != 3) { // 하단 4행이 아닐 때
					if (puzzle[i + 4].getName().equals("16")) {
						String temp = number[i + 4];
						number[i + 4] = number[i];
						number[i] = temp;

						JButton tempBtn = puzzle[i + 4];
						puzzle[i + 4] = puzzle[i];
						puzzle[i] = tempBtn;

					}
				}
			}
		}
		for (int j = 0; j < arImg.length; j++) {
			puzzle[j].setVisible(true);
			puzzlePanel.remove(puzzle[j]);
		}
		viewPuzzle();
	
		int cnt = 0;
		for (int j = 0; j < puzzle.length; j++) {
			if(j+1==Integer.parseInt(puzzle[j].getName())) {
				cnt++;
			}
		}
		if(cnt==16) {
			JOptionPane.showMessageDialog(this, "아니 이걸?");
		}
	}

	public static void main(String[] args) {
		new PuzzleGame();
	}
}
