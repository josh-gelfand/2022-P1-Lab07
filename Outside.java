import java.awt.*;
import java.applet.*;
public class Outside {
    public static void drawTan(Graphics g) {

        g.drawArc(100,93,75, 50, 90, 180);
        g.drawArc(-203, -22, 400, 135, 315, 45 );


        g.drawLine(253, 125, 253, 45);
    }
    public static void drawBlack(Graphics g){
        Color black = new Color(0,0,0);
        g.setColor(black);
        g.drawArc(155, 90, 25,25, 90, 180);
        g.drawArc(170, 78, 75, 25, 180, 90);
        g.drawArc(195, 97, 25, 5, 270, 90);
        g.drawArc(119, 104, 100, 12, 270, 90);

        g.drawLine(220, 110, 240, 95 );
        g.drawLine(240, 95, 215, 102);
    }
    public static void drawRed(Graphics g){

    }
    public static void drawWhite(Graphics g){
        Color tan = new Color(210, 180, 140);
        g.setColor(tan);
        g.drawLine(100, 125, 252, 125);
        g.drawLine(139, 143, 252, 143);
        g.drawLine(255,140, 255, 128 );
        g.drawArc(250,124, 5, 5, 0, 90);
        g.drawArc(250, 138, 5, 5, 270, 90);

    }

}