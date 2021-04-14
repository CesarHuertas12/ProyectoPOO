package com.game.tilemap;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class StaticBackground {
	
	private BufferedImage image;
	
	private double x;
	private double y;
	
	public StaticBackground(String s) {
		
		try {
			image = ImageIO.read(
				getClass().getResourceAsStream(s)
			);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void draw(Graphics2D g) {
		
		g.drawImage(image, (int)x, (int)y, null);
	}
	
}