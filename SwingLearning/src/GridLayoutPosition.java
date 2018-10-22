import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutPosition extends JFrame
{

	public GridLayoutPosition()
	{
		Container con = getContentPane();
		setLayout(new GridLayout(7, 3, 5, 5));
		for(int i = 0; i < 20; i++)
		{
			con.add(new JButton("button" + i));
		}
		setVisible(true);
		setBounds(0, 0, 500, 500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new GridLayoutPosition();
	}

}
