package program3;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
public class StudentDriver extends JFrame implements ActionListener{
	JLabel j1= new JLabel("Enter name");
	JTextField name=new JTextField(20);
	JLabel j2= new JLabel("Enter age");
	JTextField age=new JTextField(20);
	JLabel j3= new JLabel("Enter sgpa1");
	JTextField sgpa1=new JTextField(20);
	JLabel j4= new JLabel("Enter sgpa2");
	JTextField sgpa2=new JTextField(20);
	JLabel j5= new JLabel("Select category");
	JComboBox cat = new JComboBox();
	JButton submit=new JButton("submit");
	JButton done=new JButton("done");
	JButton display=new JButton("display");
	JTextField cgpa=new JTextField("your cgpa");
	JTextArea stud=new JTextArea(20,20);
	JFrame jf1=new JFrame();
	JFrame jf2=new JFrame();
	ArrayList<Student> arr=new ArrayList<>();
	StudentDriver()
	{
		jf1.add(j1);jf1.add(name);
		jf1.add(j2);jf1.add(age);
		jf1.add(j3);jf1.add(sgpa1);
		jf1.add(j4);jf1.add(sgpa2);
		jf1.add(j5);jf1.add(cat);
		jf1.add(cgpa);
		cat.addItem("gm");
		cat.addItem("obc");
		jf1.setVisible(true);
		jf1.setSize(900,800);
		jf1.setLayout(new GridLayout(8,8));
		jf2.add(stud);
		jf1.add(submit);
		jf1.add(done);
		jf1.add(display);

		submit.addActionListener(this);
		done.addActionListener(this);
		display.addActionListener(this);

		

		
	}


	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==submit)
		{
			try {
				int a1=Integer.parseInt(age.getText());
				if(a1>40||a1<18)
				{
					String newage=JOptionPane.showInputDialog("invalid age");
					age.setText(newage);
				}
					
			}
			catch(Exception e)
			{
				
			}
			check_sgpa(sgpa1);
			check_sgpa(sgpa2);
			cgpa.setText(Float.toString((Float.parseFloat(sgpa1.getText())+Float.parseFloat(sgpa2.getText()))/2));
			
		}
		
		else if(evt.getSource()==done)
		{
			Student s1=new Student(name.getText(),Integer.parseInt(age.getText()),String.valueOf(cat.getSelectedIndex()),Float.parseFloat(cgpa.getText()));
			arr.add(s1);
		}
		else
		{
			jf1.setVisible(false);
			jf2.setVisible(true);
			jf2.setSize(500,500);
			stud.setText(" ");
			for(Student s:arr)
			{
				stud.append(s.toString());
			}
		}
		
	}
	
	public void check_sgpa(JTextField sgpa)
	{
		if(Float.parseFloat(sgpa.getText())>10)
				{
					String newsgpa=JOptionPane.showInputDialog("enter valid sgpa");
					sgpa.setText(newsgpa);
				}
	}
	
	public static void main(String args[])
	{
		StudentDriver s = new StudentDriver();
	}
}
