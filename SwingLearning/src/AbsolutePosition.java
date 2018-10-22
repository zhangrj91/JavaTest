import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsolutePosition extends JFrame
{
	public AbsolutePosition()
	{
		setTitle("本窗口使用绝对布局");
		Container con = getContentPane();
		setLayout(null);
		JButton jb1 = new JButton("按钮1");
		JButton jb2 = new JButton("按钮2");
		jb1.setBounds(0, 0, 100, 200);
		jb2.setBounds(200,200,200,100);
		con.add(jb1);
		con.add(jb2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 500);
	}
	public static void main(String[] args)
	{
		new AbsolutePosition();
	}
}
