import java.awt.Container;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class JListTest extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JListTest()
	{
		// TODO Auto-generated constructor stub
		Container con = getContentPane();
		con.setLayout(null);
		MyListModel ml = new MyListModel();
		JList<String> jl = new JList<>(ml);
		JScrollPane js = new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100);
		con.add(js);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		JListTest j = new JListTest();
	}

}

class MyListModel extends AbstractListModel<String> 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String[] Contents = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6"};
	
	@Override
	public int getSize()
	{
		// TODO Auto-generated method stub
		return Contents.length;
	}

	@Override
	public String getElementAt(int index)
	{
		// TODO Auto-generated method stub
		return Contents[index];
	}
	
}