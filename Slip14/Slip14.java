/*
Anu Keswani ---> Slip No 14
Write a Java program which will create a frame if we try to close it, it should
change it’s color and it remains visible on the screen(Use swing).
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Slip14 extends JFrame
{
	JPanel p = new JPanel();

	Slip14()
	{ 
		setVisible(true);
		setSize(400,400);
		setTitle("Swing Background");
		add(p);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{ 
				p.setBackground(Color.RED);

				JOptionPane.showMessageDialog(null,"Close window","Login",JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}

	public static void main(String args[])
	{
		new Slip14();
	}
}