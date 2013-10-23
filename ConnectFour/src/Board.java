import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Board extends JPanel 
{
   // display various lines, rectangles and ovals
   public void paintComponent( Graphics g )
   {
	  int i, j, startX = 205, startY = 105, radius = 60;
      super.paintComponent( g ); // call superclass's paint method

      this.setBackground( Color.WHITE);

      g.setColor( Color.YELLOW );
      g.fillRect(200, 100, 480, 410);

      g.setColor( Color.BLACK );
      //g.fillOval(startX, startY, radius, radius);
      for(i=0; i<6; i++){
    	  for(j=0; j<7; j++){
    		  g.fillOval(startX + ((radius + 7) * j), startY + ((radius + 7) * i), radius, radius);
    	  }
    	  
    	  //g.fillOval(startX + (radius), startY + (radius * i), radius, radius);
    	  //g.fillOval(startX + (2 * radius), startY + (radius * i), radius, radius);
    	  //g.fillOval(startX + (3 * radius), startY + (radius * i), radius, radius);
    	  //g.fillOval(startX + (4 * radius), startY + (radius * i), radius, radius);
    	  //g.fillOval(startX + (5 * radius), startY + (radius * i), radius, radius);
    	  //g.fillOval(startX + (6 * radius), startY + (radius * i), radius, radius);
      }
   } // end method paintComponent
} // end class LinesRectsOvalsJPanel