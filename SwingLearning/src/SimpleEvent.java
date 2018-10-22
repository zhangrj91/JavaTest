import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SimpleEvent extends JFrame
{
	private JButton jb = new JButton("我是按钮，单击我");
	public SimpleEvent()
	{
		// TODO Auto-generated constructor stub
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(null);
		con.add(jb);
		jb.setBounds(10, 10, 100, 30);
//		jb.addActionListener(new ActionListener()
//		{
//			
//			@Override
//			public void actionPerformed(ActionEvent e)
//			{
//				// TODO Auto-generated method stub
//				if(jb.getText().equals("我是按钮，单击我"))
//				{
//					jb.setText("我被单击了");
//				}
//				
//				else if(jb.getText().equals("我被单击了"))
//				{
//					jb.setText("我是按钮，单击我");
//				}
//			}
//		});
		jb.addActionListener(new jbAction());
	}
	
	class jbAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			if(jb.getText().equals("我是按钮，单击我"))
				{
					jb.setText("我被单击了");
				}
				
				else if(jb.getText().equals("我被单击了"))
				{
					jb.setText("我是按钮，单击我");
				}
		}
		
	}
	
	public static void main(String[] args)
	{
		new SimpleEvent();
	}
	
}
