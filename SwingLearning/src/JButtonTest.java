import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class JButtonTest extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	public JButtonTest()
	{
		// TODO Auto-generated constructor stub
		java.net.URL url = JButtonTest.class.getResource("imageButtoo.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5));
		Container con = getContentPane();
		for(int i = 0; i < 5; i++)
		{
			JButton j = new JButton("button" + i);
			con.add(j);
			if(i%2 == 0)
			{
				j.setEnabled(false);
			}
			else
			{
				j.setIcon(icon);
			}
		}
		JButton jb = new JButton();
		jb.setMaximumSize(new Dimension(90, 90));//设置按钮大小与图标大小一样
		jb.setIcon(icon);
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		con.add(jb);
		setTitle("´´½¨´øÎÄ×ÖÓëÍ¼Æ¬µÄ°´Å¥");
		setSize(350, 150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new JButtonTest();
	}

}
