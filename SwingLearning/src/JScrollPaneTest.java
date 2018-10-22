import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame
{
	
	public JScrollPaneTest()
	{
		// TODO Auto-generated constructor stub
		Container con = getContentPane();
		JTextArea ta = new JTextArea(20, 50);
		JScrollPane sp = new JScrollPane(ta);
		con.add(sp);
		setTitle("带滚动条的文字编译器");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new JScrollPaneTest();
	}

}
