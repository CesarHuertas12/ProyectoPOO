package com.game.Player;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Moves extends JPanel implements KeyListener {

	private JLabel Avatar = new JLabel();

	public Moves() {
		ImageIcon imagen = new ImageIcon("E:/Cuarto semestre/POO/Pruebas/Link.jpg");// Se llama la imagen y se crea
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));// Aqui escogemos el
																									// tamaño de la
																									// imagen
		Avatar.setIcon(icono);
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
			Avatar.setLocation(Avatar.getX() + 5, Avatar.getY());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
