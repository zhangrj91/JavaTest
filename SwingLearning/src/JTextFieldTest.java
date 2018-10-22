import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JTextFieldTest extends JFrame
{
	
	public JTextFieldTest()
	{
		// TODO Auto-generated constructor stub
		final JTextField jt = new JTextField("aaa",20);
		final JButton jb = new JButton("清除");
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jt);
		con.add(jb);
		setVisible(true);
		setSize(250, 100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jt.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				jt.setText("触发事件");
			}
		});
		jb.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				jt.setText("");
				jt.requestFocus();
			}
		});
	}
	
	public static void main(String[] args)
	{
		new JTextFieldTest();
	}
}
