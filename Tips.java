import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Tips extends JPanel{
	
	private ImageIcon bg = new ImageIcon("Tip.png");
	private ImageIcon exitover = new ImageIcon("back.png");
	public JButton BExitover  = new JButton(exitover);
	
	Tips(){
		
		setLayout(null);
		BExitover.setBounds(50, 40, 50,50);
		add(BExitover);

	}
	public void paintComponent(Graphics g){
		  super.paintComponent(g);
		  g.drawImage(bg.getImage(),0,0,1400,800,this);
          g.setColor(Color.black);
		  
	      
	  }
}
