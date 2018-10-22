import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutPosition extends JFrame
{
	String[] border = {BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST};
	String[] buttonName = {"center", "north", "south", "west", "east"};
	public BorderLayoutPosition()
	{
		// TODO Auto-generated constructor stub
		setTitle("这个窗体使用边界布局管理器");
		Container con = getContentPane();
		setLayout(new BorderLayout());
		for(int i = 0; i < border.length; i++)
		{
			con.add(border[i], new JButton(buttonName[i]));
		}
		setSize(350,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new BorderLayoutPosition();
	}
}
