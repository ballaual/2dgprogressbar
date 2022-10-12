package de.ballaual.progressbar;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

import java.io.File;

import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] argv) throws Exception {
        int width = 220;
        int height = 50;

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = bufferedImage.createGraphics();

        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));

        g2d.setColor(Color.lightGray);

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(10, 25, 200, 5, 5, 5);
        g2d.draw(roundedRectangle);
        g2d.fill(roundedRectangle);

        Ellipse2D circle = new Ellipse2D.Double(150, 20, 15, 15);
        g2d.draw(circle);
        g2d.fill(circle);

        g2d.dispose();
        RenderedImage rendImage = bufferedImage;

        File file = new File("newimage.png");
        ImageIO.write(rendImage, "png", file);

    }

}
