import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JComboBoxModelTest extends JFrame
{

	JComboBox<String> jc = new JComboBox<>(new MyComboBox());
	JLabel jl = new JLabel("请选择证件");
	
	public JComboBoxModelTest()
	{
		// TODO Auto-generated constructor stub
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setSize(new Dimension(160, 180));
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		c.add(jl);
		c.add(jc);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new JComboBoxModelTest();
	}

}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>
{
	String selecteditem = null;
	String[] test = {"身份证", "军人证", "学生证", "工作证"};

	@Override
	public int getSize()
	{
		// TODO Auto-generated method stub
		return test.length;
	}
	@Override
	public String getElementAt(int index)
	{
		// TODO Auto-generated method stub
		return test[index];
	}
	@Override
	public void setSelectedItem(Object anItem)
	{
		// TODO Auto-generated method stub
		selecteditem = (String) anItem;
	}
	@Override
	public Object getSelectedItem()
	{
		// TODO Auto-generated method stub
		return selecteditem;
	}
	
	public int getIndex()
	{
		for (int i = 0; i < test.length; i++) {
			if (test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}