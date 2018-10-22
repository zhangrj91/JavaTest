import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class CheckBoxTest extends JFrame
{

	private static final long seriaVersionUID = 1L;
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JTextArea jt=new JTextArea(3,10);
	private JCheckBox jc1=new JCheckBox("1");
	private JCheckBox jc2=new JCheckBox("2");
	private JCheckBox jc3=new JCheckBox("3");
	
	public CheckBoxTest()
	{
		// TODO Auto-generated constructor stub
		Container con = getContentPane();
		setSize(200, 160);
		setVisible(true);
		setTitle("aaa");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		con.setLayout(new BorderLayout());
		con.add(panel1,BorderLayout.NORTH);
		final JScrollPane scrollPane = new JScrollPane(jt);
		panel1.add(scrollPane);
		
		con.add(panel2, BorderLayout.SOUTH);
		panel2.add(jc1);
		jc1.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				if(jc1.isSelected())
				{
					jt.append("复选框1被选中\n");
				}
			}
		});
		
		panel2.add(jc2);
		jc2.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				if(jc2.isSelected())
				{
					jt.append("复选框2被选中\n");
				}
			}
		});
		
		panel2.add(jc3);
		jc3.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				if(jc3.isSelected())
				{
					jt.append("复选框3被选中\n");
				}
			}
		});
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new CheckBoxTest();
	}

}
