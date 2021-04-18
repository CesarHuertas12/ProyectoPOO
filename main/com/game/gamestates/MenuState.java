package com.game.gamestates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.game.tilemap.Background;

public class MenuState extends GameState {

	private Background bg;

	public static int currentChoice = 0;
	private String[] options = { "Start", "Options", "Quit" };

	private Color titleColor;
	private Font titleFont;

	private Font font;

	public MenuState(GameStateManager gsm) {

		this.gsm = gsm;

		try {

			bg = new Background("/Backgrounds/menubg.gif", 1);
			bg.setVector(-0.3, 0);

			titleColor = new Color(128, 0, 0);
			titleFont = new Font("Century Gothic", Font.PLAIN, 28);

			font = new Font("Times New Roman", Font.PLAIN, 15);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void init() {
	}

	public void update() {
		bg.update();
	}

	public void draw(Graphics2D g) {

		// draw bg
		bg.draw(g);

		// draw title
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("Adventure Game", 40, 70);

		// draw menu options
		g.setFont(font);
		for (int i = 0; i < options.length; i++) {
			if (i == currentChoice) {
				g.setColor(Color.RED);
			} else {
				g.setColor(Color.BLACK);
			}
			g.drawString(options[i], 140, 120 + i * 30);
		}

	}

	private void select() {
		if (currentChoice == 0) {
			// start
		}
		if (currentChoice == 1) {
			gsm.setState(GameStateManager.OPTIONS);
			OptionsState.currentChoice = 0;
		}
		if (currentChoice == 2) {
			System.exit(0);
		}
	}

	public void keyPressed(int k) {
		if (k == KeyEvent.VK_ENTER) {
			select();
		}
		if (k == KeyEvent.VK_W) {
			currentChoice--;
			if (currentChoice == -1) {
				currentChoice = options.length - 1;
			}
		}
		if (k == KeyEvent.VK_S) {
			currentChoice++;
			if (currentChoice == options.length) {
				currentChoice = 0;
			}
		}
	}

	public void keyReleased(int k) {
	}

}