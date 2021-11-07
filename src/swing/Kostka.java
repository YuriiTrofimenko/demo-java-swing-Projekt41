/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author yurii
 */
public class Kostka extends JButton {
    public Integer oczek = 0;
    long rzutów, sukcesów;
    
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(255, 253, 208));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10 );
        g.setColor(Color.RED);
        int cx = getWidth()/7, cy = getHeight()/7;
        if( oczek > 1 ) { g.fillOval(cx, cy, cx, cy); g.fillOval(cx*5, cy*5, cx, cy); }
        if( oczek == 6 ) { g.fillOval(cx*3, cy, cx, cy); g.fillOval(cx*3, cy*5, cx, cy); }
        if( oczek >= 4 ) { g.fillOval(cx*5, cy, cx, cy); g.fillOval(cx, cy*5, cx, cy); }
        if( oczek % 2 == 1 ) g.fillOval(cx*3, cy*3, cx, cy);
    }
    
}
