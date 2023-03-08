import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Stf implements ActionListener
{
JFrame fr;
JLabel l1;
JButton b1,b2,b3,b4,b5,b6;
JPanel pa;
Font fo;
public Stf()
{
fo=new Font("Times New Roman",Font.BOLD,18);
fr=new JFrame("USER");
fr.setSize(600,500);
fr.setResizable(false);
pa=new JPanel();
pa.setLayout(null);
fr.add(pa);
l1=new JLabel("_User Functions_");
b1=new JButton("View_Courses");b5=new JButton("Read_Notes");b6=new JButton("View_Papers");
b2=new JButton("Back");b3=new JButton("Logout");
l1.setBounds(200,0,200,150);
b1.setBounds(30,170,200,40);b5.setBounds(350,170,200,40);
b6.setBounds(200,270,200,40);
b2.setBounds(30,380,200,40);b3.setBounds(350,380,200,40);
l1.setFont(fo);b1.setFont(fo);b2.setFont(fo);b3.setFont(fo);b5.setFont(fo);b6.setFont(fo);
pa.add(l1);pa.add(b1);pa.add(b2);pa.add(b3);pa.add(b5);pa.add(b6);
fr.setDefaultCloseOperation(3);
fr.setVisible(true);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
b5.addActionListener(this);b6.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
	if(evt.getSource()==b1)
	{
		Corx eu=new Corx();
		fr.dispose();
	}
	if(evt.getSource()==b5)
	{
		Cors yu=new Cors();
		fr.dispose();
	}
	if(evt.getSource()==b6)
	{
	    Stvp n9=new Stvp();
		fr.dispose();	
	}
	if(evt.getSource()==b2)
	{
		Stulogin yes2=new Stulogin();
		fr.dispose();
	}
	if(evt.getSource()==b3)
	{
        Tul tl=new Tul();
		fr.dispose();
	}
}
public static void main(String ...k)
{
	new Stf();
}
}

	


