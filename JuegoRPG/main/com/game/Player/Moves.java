package com.game.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Moves extends JPanel implements KeyListener {

	private JLabel Avatar = new JLabel("Este eres tu");

	public Moves() {
		addKeyListener(this);
		setFocusable(true);
		add(Avatar);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getExtendedKeyCode() == KeyEvent.VK_W) {
			Avatar.setLocation(Avatar.getX(), Avatar.getY() - 5);

		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_A) {
			Avatar.setLocation(Avatar.getX() - 5, Avatar.getY());
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_S) {
			Avatar.setLocation(Avatar.getX(), Avatar.getY() + 5);
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_D) {
			Avatar.setLocation(Avatar.getX() + 5, Avatar.getY() - 5);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}