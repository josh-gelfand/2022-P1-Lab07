import java.awt.*;
import java.applet.*;

public class Lab07  extends Applet{
    public void paint(Graphics g){
        Outside.drawTan(g);
        Outside.drawBlack(g);
        Outside.drawRed(g);
        Outside.drawWhite(g);

        Tan.drawTongue(g);
        Tan.drawMidsole(g);

        Red.drawTip(g);
        Red.drawVamp(g);
        Red.drawHeel(g);








    }

}

