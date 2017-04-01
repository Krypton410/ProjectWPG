
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;

/**
 *
 * @author Maxwell
 */
import java.awt.Point;
import java.awt.geom.Arc2D;
public class CustomPanel extends JPanel {
    
    int progress = 0;
    public void UpdateProgress(int progress_value){
        progress=progress_value;
        
    }
    @Override
    public void paint (Graphics g)
    {
    super.paint(g);
    Graphics2D g2=(Graphics2D)g;
    g2.translate(this.getWidth()/2, this.getHeight()/2);
    g2.rotate(Math.toRadians(270));
    Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
    arc.setFrameFromCenter(new Point(0,0), new Point(120,120));
    arc.setAngleStart(1);
    arc.setAngleExtent(-progress*3.6);//360/100=3.6
    g2.setColor(Color.red);
    g2.draw(arc);
    g2.fill(arc);
    
    }
    
}
