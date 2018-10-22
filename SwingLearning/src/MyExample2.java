import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import org.w3c.dom.views.AbstractView;

public class MyExample2 extends JFrame
{
	String[] contents = {"a", "b", "c", "d"};
	private JComboBox<String> jsp = new JComboBox<>();
	private JButton jb = new JButton("添加");
	int i = 0;
	public MyExample2()
	{
		// TODO Auto-generated constructor stub
		Container con = getContentPane();
		setVisible(true);
		setSize(300,200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		con.add(jsp);
		con.add(jb);
		con.setLayout(new FlowLayout());
		jsp.setSize(300,30);
		jb.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				jsp.addItem(contents[i++]);;
			}
		});
	}
	
	public static void main(String[] args)
	{
		new MyExample2();
	}
}
