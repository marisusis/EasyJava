package io.github.spacegeek224;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleDisplay {
	public static void labelarea(String ltext, String ftitle, int width, int height) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.add(p);
		JLabel l = new JLabel();
		p.add(l);
		l.setVisible(true);
		p.setVisible(true);
		f.setVisible(true);
		l.setText(ltext);
		f.setTitle(ftitle);
		f.setSize(width, height);
	}
}
