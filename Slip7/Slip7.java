/*
Anu Keswani ---> Slip No 7
Write a java program to display “Hello Java” with settings Font- Georgia, oreground
color- Red, background color – Blue on the Frame.
*/

import java.awt.*;

class Slip7 extends Frame
{ 
	Label l;

	Slip7()
	{
		l=new Label("Hello java");
		l.setFont(new Font("Georgia",Font.BOLD,14));
		l.setForeground(Color.RED);

		add(l);

		setBackground(Color.BLUE);
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public static void main(String a[])
	{
		new Slip7();
	}
}