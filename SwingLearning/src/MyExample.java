import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MyExample extends JFrame
{
	private JCheckBox cb1= new JCheckBox("男");
	private JCheckBox cb2= new JCheckBox("女");
	String[] color = {"红", "蓝", "绿"};
	private JComboBox<String> jcb;
	private JButton jb1 = new JButton("确定");
	private JButton jb2 = new JButton("取消");
	public MyExample()
	{
		// TODO Auto-generated constructor stub
		jcb = new JComboBox<>(color);
		jcb.setSize(300,30);
		Container con = getContentPane();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(300,200);
		con.add(jcb, BorderLayout.NORTH);
		JPanel panel = new JPanel();
		con.add(panel,BorderLayout.CENTER);
		panel.add(cb1);
		panel.add(cb2);
		JPanel panel2 = new JPanel();
		con.add(panel2,BorderLayout.SOUTH);
		panel2.add(jb1);
		panel2.add(jb2);
	}
	
	public static void main(String[] args)
	{
		new MyExample();
	}
}
