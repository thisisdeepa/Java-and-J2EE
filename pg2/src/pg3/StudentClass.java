package pg3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedList;

public class StudentClass implements ActionListener{
		LinkedList<Student> st=new LinkedList<Student>();
		JLabel j1= new JLabel("Enter name");
		JLabel j2= new JLabel("Enter usn");
		JLabel j3= new JLabel("Enter age");
		JLabel j4= new JLabel("Enter address");
		JLabel j5= new JLabel("Select category");
		JLabel j6= new JLabel("Enter I sem sgpa");
		JLabel j7= new JLabel("Enter II sem sgpa");
		JLabel j8= new JLabel("Enter III sem sgpa");
		JLabel tcgpa= new JLabel("cgpa obtained");
		
		JTextField name= new JTextField(20);
		JTextField usn= new JTextField(20);
		JComboBox cat =new JComboBox();
		JTextField age= new JTextField(2);
		JTextField address= new JTextField(20);
		
		JTextField sgpa1= new JTextField(2);

		JTextField sgpa2= new JTextField(2);

		JTextField sgpa3= new JTextField(2);
		JTextField cgpa= new JTextField(2);
		
		JButton submit=new JButton("submit");
		JButton done=new JButton("done");
		JButton display=new JButton("display");
		
		JTextArea stud_disp= new JTextArea(3,4);
		JFrame jf1=new JFrame("details");
		JFrame jf2=new JFrame("displaying");
		
		StudentClass()
		{
			cat.addItem("Gm");
			cat.addItem("sc");
			cat.addItem("obc");
			jf1.add(j1);jf1.add(name);
			jf1.add(j2);jf1.add(usn);
			jf1.add(j3);jf1.add(age);
			jf1.add(j4);jf1.add(address);
			jf1.add(j5);jf1.add(cat);
			jf1.add(j6);jf1.add(sgpa1);
			jf1.add(j7);jf1.add(sgpa2);
			jf1.add(j8);jf1.add(sgpa3);
			jf1.add(tcgpa);jf1.add(cgpa);
			jf1.add(submit);
			jf1.add(done);
			jf1.add(display);
			
			jf2.add(stud_disp);
			jf1.setLayout(new GridLayout(8,8));
			jf1.setSize(800,900);
			
			jf1.setVisible(true);
			submit.addActionListener(this);
			done.addActionListener(this);
			display.addActionListener(this);
			
			

}


	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==submit)
		{
			try {
				int v1=Integer.parseInt(age.getText());
				if(v1<18||v1>40)
				{
					String age1=JOptionPane.showInputDialog("Enter valid age");
					age.setText(age1);
				}
			}
			catch(NumberFormatException e){
				
			}
			check_valsgpa(sgpa1);
			check_valsgpa(sgpa2);
			check_valsgpa(sgpa3);
			cgpa.setText(Float.toString(calc_cgpa()));
			
			
		}
		else if(evt.getSource()==done)
		{
			Student s1= new Student(name.getText(),usn.getText(),address.getText(),
					Integer.parseInt(age.getText()),String.valueOf(cat.getSelectedItem()),Float.parseFloat(cgpa.getText()));
			st.add(s1);
		}
		else
		{
			jf1.setVisible(false);
			jf2.setVisible(true);
			jf2.setSize(500,500);
			stud_disp.setText(" ");
			for(Student s:st)
			{
				stud_disp.append(s.toString());
			}
		}
		
	}
	public void check_valsgpa(JTextField sgpa)
	{
		try {
			if(Float.parseFloat(sgpa.getText())>10)
			{
				String s1= JOptionPane.showInputDialog("Enter valid sgpa");
				sgpa.setText(s1);
			}
		}
		catch(NumberFormatException e)
		{
			
		}
	}
	float calc_cgpa()
	{
		float v1=Float.parseFloat(sgpa1.getText());
		float v2=Float.parseFloat(sgpa2.getText());
		float v3=Float.parseFloat(sgpa3.getText());
		float cgpa=(v1+v2+v3)/3;
		return cgpa;
		
	}
	
	public static void main(String args[])
	{
		StudentClass s= new StudentClass();
	}

}

