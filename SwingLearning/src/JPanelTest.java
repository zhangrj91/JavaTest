import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JPanelTest extends JFrame
{
	public JPanelTest()
	{
		// TODO Auto-generated constructor stub
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1, 10, 10));
		JPanel p1 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
		p1.add(new JButton("1")); // ÔÚÃæ°åÖÐÌí¼Ó°´Å¥
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p3.add(new JButton("6"));
		p3.add(new JButton("7"));
		p4.add(new JButton("8"));
		p4.add(new JButton("9"));
		con.add(p1); // ÔÚÈÝÆ÷ÖÐÌí¼ÓÃæ°å
		con.add(p2);
		con.add(p3);
		con.add(p4);
		setTitle("ÔÚÕâ¸ö´°ÌåÖÐÊ¹ÓÃÁËÃæ°å");
		setSize(420, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JPanelTest();
	}
}
