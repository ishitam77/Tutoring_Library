import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Coraf implements ActionListener
{
JFrame fr;
JButton b3,b4,b5,b6,b7,b8,b9,b10;
JPanel pa;
Font fo;
public Coraf()
{
fo=new Font("Times New Roman",Font.BOLD,18);
fr=new JFrame("Notes");
fr.setSize(850,570);
fr.setResizable(false);
pa=new JPanel();
pa.setLayout(null);
fr.add(pa);
b3=new JButton("1st_Semester");b4=new JButton("2nd_Semester");
b5=new JButton("3rd_Semester");b6=new JButton("4th_Semester");
b7=new JButton("5th_Semester");b8=new JButton("6th_Semester");
b9=new JButton("Back");b10=new JButton("Logout");
b3.setBounds(100,50,200,40);b4.setBounds(500,50,200,40);
b5.setBounds(100,150,200,40);b6.setBounds(500,150,200,40);
b7.setBounds(100,250,200,40);b8.setBounds(500,250,200,40);
b9.setBounds(30,400,200,40);b10.setBounds(600,400,200,40);
b3.setFont(fo);
b4.setFont(fo);b5.setFont(fo);b6.setFont(fo);b7.setFont(fo);
b8.setFont(fo);b9.setFont(fo);b10.setFont(fo);
pa.add(b3);pa.add(b4);pa.add(b5);
pa.add(b6);pa.add(b7);pa.add(b8);pa.add(b9);pa.add(b10);
fr.setDefaultCloseOperation(3);
fr.setVisible(true);
b3.addActionListener(this);
b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
b10.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
	if(evt.getSource()==b3)
	{
		Sem1 t3=new Sem1();
		fr.dispose();
	}
	if(evt.getSource()==b4)
	{
		Sem2 t5=new Sem2();
		fr.dispose();
	}
	if(evt.getSource()==b5)
	{
		Sem3 t6=new Sem3();
		fr.dispose();
	}
	if(evt.getSource()==b6)
	{
		Sem4 t7=new Sem4();
		fr.dispose();
	}
	if(evt.getSource()==b7)
	{
		Sem5 t8=new Sem5();
		fr.dispose();
	}
	if(evt.getSource()==b8)
	{
		Sem6 t9=new Sem6();
		fr.dispose();
	}
	if(evt.getSource()==b9)
	{
		Admf t10=new Admf();
		fr.dispose();
	}
	if(evt.getSource()==b10)
	{
		Tul tl=new Tul();
		fr.dispose();	
	}
}
public static void main(String ...k)
{
	new Coraf();
}
}

	


